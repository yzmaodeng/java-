package com.zl.Datastructure;

public class testLinkNode {
	 public SingleLinkNode linkList=new SingleLinkNode();  
	    public void testaddLastNode(){  
	        linkList.addLastNode(1);  
	        linkList.addLastNode(2);  
	        linkList.addLastNode(3);  
	        linkList.addLastNode(4);  
	        linkList.printLinkList();  
	    }  
	    public void testaddHeadNode()  
	    {  
	        linkList.addHeadNode(1);  
	        linkList.addHeadNode(2);  
	        linkList.addHeadNode(3);  
	        linkList.addHeadNode(4);  
	        linkList.printLinkList();  
	    }  
	    public void testdaleteNode()  
	    {  
	        if(linkList.deleteNode(3)==false)  
	            System.out.println("删除位置有误");  
	        linkList.printLinkList();  
	    }  
	    public void testUpateNode()  
	    {  
	        if(linkList.updateNode(2, 10)==false)  
	            System.out.println("修改位置有误");  
	        linkList.printLinkList();  
	    }  
	    public void testSortLinkList()  
	    {  
	        linkList.SortLinkList();  
	        linkList.printLinkList();  
	    }  

	public static void main(String[] args) {
		
		testLinkNode main=new testLinkNode();  
        main.testaddHeadNode();  
        System.out.println("================================");  
        main.testSortLinkList();  

	}

}
