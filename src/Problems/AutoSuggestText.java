package Problems;

class TrieNode {
    TrieNode children[] = new TrieNode[26];
    boolean isEndOfWord;

    TrieNode() {
        isEndOfWord = false;
        for(int i=0;i<26;i++) {
            children[i] = null;
        }
    }
}

public class AutoSuggestText {

    TrieNode root = new TrieNode();

    void insertInTrie(String key) {
        TrieNode pCrawl = root;
        for(int level=0;level<key.length();level++) {
            int index = key.charAt(level)-'a';
            if(pCrawl.children[index]==null) {
                pCrawl.children[index] = new TrieNode();
            }
            pCrawl = pCrawl.children[index];
        }
        pCrawl.isEndOfWord = true;
    }

    void printAutoSuggestText(TrieNode root, String key) {      // print in sorted order
        if(root==null) {
            return;
        }
        if(root.isEndOfWord) {
            System.out.print(key + " ");
        }
        for(int i=0;i<26;i++) {
            printAutoSuggestText(root.children[i], key+(char)(i+97));
        }
    }

    void autoSuggestText(String prefix) {
        TrieNode pCrawl = root;
        for(int i=0;i<prefix.length();i++) {
            int index = prefix.charAt(i)-'a';
            if(pCrawl.children[index]==null) {
                return;
            }
            pCrawl = pCrawl.children[index];
        }
        printAutoSuggestText(pCrawl, prefix);
    }

    public static void main(String[] args) {
        AutoSuggestText ob = new AutoSuggestText();

        String keys[] = {"hello", "dog", "hell", "cat", "a", "hel","help","helps","helping"};

        for(String key: keys) {
            ob.insertInTrie(key);
        }
        System.out.println("Auto suggest for hel: ");
        ob.autoSuggestText("hel");
    }
}
