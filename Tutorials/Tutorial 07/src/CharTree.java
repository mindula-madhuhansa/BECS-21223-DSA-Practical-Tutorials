public class CharTree {
    private CharNode root;
    CharTree(){
        root=null;
    }
    public void insert(char data){
        root=insert(root,data);
    }
    private CharNode insert(CharNode node,char data){
        if (node==null){
            node=new CharNode(data);
        }
        else {
            if (data<=node.data){
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
    private void preOrder(CharNode r){
        if (r!=null){
            System.out.print(r.data+" ");
            preOrder(r.left);
            preOrder(r.right);
        }
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(CharNode r){
        if (r!=null){
            inOrder(r.left);
            System.out.print(r.data+" ");
            inOrder(r.right);
        }
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(CharNode r) {
        if (r != null) {
            postOrder(r.left);
            postOrder(r.right);
            System.out.print(r.data + " ");
        }
    }
}
