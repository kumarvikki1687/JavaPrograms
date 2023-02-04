package DataStructure.Trie;

import java.util.HashMap;

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

public class TrieOperations {

    /*
    Insertion	O(n)
    Searching	O(n)
     */
    TrieNode root = new TrieNode();

    void insertInTrie(String key) {
        TrieNode pCrawl = root;
        for(int level=0;level< key.length();level++) {
            int index = key.charAt(level)-'a';
            if(pCrawl.children[index]==null) {
                pCrawl.children[index] = new TrieNode();
            }
            pCrawl = pCrawl.children[index];
        }
        pCrawl.isEndOfWord = true;
    }

    boolean searchInTrie(String key) {
        TrieNode pCrawl = root;
        for(int level=0;level<key.length();level++) {
            int index = key.charAt(level)-'a';
            if(pCrawl.children[index]==null) {
                return false;
            }
            pCrawl = pCrawl.children[index];
        }
        return pCrawl.isEndOfWord;
    }

    void displayTrie(TrieNode trieNode, String key) {       // print in sorted order
        if(trieNode==null) {
            return;
        }
        if(trieNode.isEndOfWord) {
            System.out.print(key + " ");
        }
        for(int i=0;i<26;i++) {
            String st = key + (char)(i+97);     // to convert index to char
            displayTrie(trieNode.children[i], st);
        }
    }

    public static void main(String[] args) {

        // to store in trie
        String keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};

        TrieOperations ob = new TrieOperations();

        for(String key: keys) {
            ob.insertInTrie(key);
        }

        if(ob.searchInTrie("the"))
            System.out.println("the --- " + "Found in Trie");
        else System.out.println("the --- " + "Not Found in Trie");

        if(ob.searchInTrie("these"))
            System.out.println("these --- " + "Found in Trie");
        else System.out.println("these --- " + "Not Found in Trie");

        if(ob.searchInTrie("their"))
            System.out.println("their --- " + "Found in Trie");
        else System.out.println("their --- " + "Not Found in Trie");

        if(ob.searchInTrie("thaw"))
            System.out.println("thaw --- " + "Found in Trie");
        else System.out.println("thaw --- " + "Not Found in Trie");

        System.out.println("\nTrie is: ");
        ob.displayTrie(ob.root, "");
    }
}
