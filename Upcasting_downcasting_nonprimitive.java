public class Upcasting_downcasting_nonprimitive {
    void main(){
        //upcasting
        putChild c=new putChild();
        putParent p= c;
        //String m=p.degree;//correct
        //String mc=p.college;//CTE
        //String m2=c.degree;//correct

        //Indirect downcasting
        putChild c2=(putChild) p;

        String education = c2.education;
        String degree = c2.degree;

        System.out.println(education);
        System.out.println(degree);

        //direct downcasting //RTE occurs due to classcast expection
        //putParent p2=new putParent();
        //putChild c3=(putChild) p2;

        //String degree1=c3.degree;//RTE bz of class cast expection -->runtime error
        //String education1= c3.education;//RTE same as above


        //Hireichical//not possible in this case where the same Classcast expectioin occurs

        putChild1 cg1=new putChild1();

        putParent pg=cg1;

        putChild cg=(putChild) pg;







    }
}

class putParent{
    String degree="MSC";
}

class putChild extends putParent{
    String education="College";
}

class putChild1 extends putParent{
    String k2="Rocker";
}