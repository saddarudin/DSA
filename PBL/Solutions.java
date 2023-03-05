package PBL;

public class Solutions {
    public University search(MyHashmap map,String key){
        return map.get(key);
    }
    public University[] topX(MyLinkedStack stack,int X){
        University[] uet=new University[X];
        String[] keys=new String[X];
        MyHashmap map=Main.getMap();
        for(int i=0;i<X;i++){
            keys[i]=stack.pop();
            uet[i]=map.get(keys[i]);
        }
        for(int i=X-1;i>=0;i--)stack.push(keys[i]);
        return uet;
    }
    public University[] bottomX(MyLinkedStack stack,int X){
        University[] uet=new University[X];
        MyHashmap map=Main.getMap();
        String[] keys=new String[map.size()];
        int count=0;
        for(int i=0;i< map.size();i++) keys[i]=stack.pop();
        for(int i=map.size()-X;i< map.size();i++)uet[count++]=map.get(keys[i]);
        for(String key:keys)stack.push(key);
        return uet;
    }

    public static void main(String[] args) {
        new Main();
        MyHashmap map=Main.getMap();
        Solutions s=new Solutions();
        MyLinkedStack stack=Main.getKPK_UETs();

//        System.out.println("WR          AR      PR      Pub         Loc             Name");
//        for(String key:new Main().keys) System.out.println(s.search(map,key));
//        University[] uet=s.bottomX(stack,10);
//        for(University u:uet) System.out.println(u);
        stack.traverse();
    }
}
