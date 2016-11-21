package com.tree;

public class MinimalBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5,6,7,8,9};
		
		MinimalBST ob = new MinimalBST();
		
		TreeNode tree = ob.createMinBST(array);
		
		ob.printTree(tree);
	}
	
	public void printTree(TreeNode tree){
		if(tree != null){
		    printTree(tree.left);
			System.out.println(tree.data);
		    printTree(tree.right);
		}
	}
	
	public TreeNode createMinBST(int arr[]){
		return createMinimalBST(arr, 0, arr.length-1);
	}

	private TreeNode createMinimalBST(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(end < start)
			return null;
		int mid = (start +end)/2;
		
		TreeNode n = new TreeNode(arr[mid]);
		
		n.left = createMinimalBST(arr, start, mid-1);
		n.right = createMinimalBST(arr, mid + 1, end);
		return n;
	}
}
