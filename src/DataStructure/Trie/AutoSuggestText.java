package DataStructure.Trie;

class TrieNodeNew {
    TrieNodeNew children[] = new TrieNodeNew[26];
    boolean isEndOfWord;

    TrieNodeNew() {
        isEndOfWord = false;
        for(int i=0;i<26;i++) {
            children[i] = null;
        }
    }
}

public class AutoSuggestText {

    TrieNodeNew root = new TrieNodeNew();

    void insertInTrie(String key) {
        TrieNodeNew pCrawl = root;
        for(int level=0;level<key.length();level++) {
            int index = key.charAt(level)-'a';
            if(pCrawl.children[index]==null) {
                pCrawl.children[index] = new TrieNodeNew();
            }
            pCrawl = pCrawl.children[index];
        }
        pCrawl.isEndOfWord = true;
    }

    void printAutoSuggestText(TrieNodeNew root, String key) {   // print in sorted order
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
        TrieNodeNew pCrawl = root;
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
