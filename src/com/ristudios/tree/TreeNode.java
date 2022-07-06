package com.ristudios.tree;

import javax.swing.tree.TreeCellRenderer;

public class TreeNode {

    private int cont;
    private TreeNode nodeRight, nodeLeft;

    public TreeNode(int cont, TreeNode left, TreeNode right){
        this.cont = cont;
        this.nodeLeft = left;
        this.nodeRight = right;
    }

    public int count(){
        int factor = 0;
        if (cont > 0) factor++;
        if (cont < 0) factor--;
        if (nodeLeft != null && nodeRight != null){
            return nodeLeft.count() + nodeRight.count() + factor;
        }
        else if (nodeRight != null){
            return nodeRight.count() + factor;
        }
        else if (nodeLeft != null){
            return nodeLeft.count() + factor;
        }
        return factor;
    }
}
