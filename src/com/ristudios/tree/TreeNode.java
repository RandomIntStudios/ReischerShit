package com.ristudios.tree;

import javax.swing.tree.TreeCellRenderer;

public class TreeNode {

    private int cont;
    private boolean boolCont;
    private TreeNode nodeRight, nodeLeft;

    public TreeNode(int cont, boolean boolCont, TreeNode left, TreeNode right){
        this.cont = cont;
        this.boolCont = boolCont;
        this.nodeLeft = left;
        this.nodeRight = right;
    }


    //CODE Aufgabe 5 aus Altklausur SS16, unsicher ob richtig!!
    public void swap(){
        if (nodeLeft != null && nodeRight != null){
            TreeNode temp = nodeLeft;
            nodeLeft = nodeRight;
            nodeRight = temp;
        }
    }

    //CODE Aufgabe 5 aus Altklausur SS21

    public String bits(){
        String s = "";
        if (boolCont) s += "1";
        else s += "0";
        if (nodeLeft != null && nodeRight != null){
            return nodeLeft.bits() +  s + nodeRight.bits();
        }
        else if (nodeRight != null){
            return s + nodeRight.bits();
        }
        else if (nodeLeft != null){
            return nodeLeft.bits() + s;
        }
        return s;
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
