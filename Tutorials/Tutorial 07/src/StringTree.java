public class StringTree {
    private StringNode root;
    StringTree(){
        root=null;
    }
    public void insert(String data){
        root=insert(root,data);
    }
    private StringNode insert(StringNode node,String data){
        if (node==null){
            node=new StringNode(data);
        }
        else {
            if (data.charAt(0)<=node.data.charAt(0)){
                node.left=insert(node.left,data);
            }
            else {
                node.right=insert(node.right,data);
            }
        }
        return node;
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(StringNode r){
        if (r!=null){
            System.out.print(r.data+" ");
            preOrder(r.left);
            preOrder(r.right);
        }
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(StringNode r){
        if (r!=null){
            inOrder(r.left);
            System.out.print(r.data+" ");
            inOrder(r.right);
        }
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(StringNode r){
        if (r!=null){
            postOrder(r.left);
            postOrder(r.right);
            System.out.print(r.data+" ");
        }
    }
}
