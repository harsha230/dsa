import java.util.ArrayList;

class TrieNode{

	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}


public class Trie {

	private TrieNode root;
	public int count;
	public Trie() {
		root = new TrieNode('\0');
	}

	public boolean search(String word){
		return search(root, word);
	}
    private boolean add(TrieNode root, String word){
		if(word.length() == 0){
			if(root.isTerminating) {
				return false;
			}
			else {
				root.isTerminating = true;
				return true;
			}
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		return add(child, word.substring(1));
	}
	private boolean search(TrieNode root, String word) {
		if(word.length() == 0){
			return true;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		return search(child, word.substring(1));
	}
    public void add(String word){
		boolean b=add(root, word);
        return ;
			
		}
	
	

	public boolean patternMatching(ArrayList<String> vect, String pattern) {
        // Write your code here
        Trie r=new Trie();
        for(String s: vect){
            for(int i=0;i<s.length();i++){
                r.add(s);
               s=s.substring(1);
            }
            
        }
       return  r.search(pattern);
        
	}
}

