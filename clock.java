public class clock{
      public static void main(String[] args){
              double H;
              double angle;
              double min;
              for(H=0;H<12;H++){
              for(min=0;min<12;min++){
              angle=(H*30)+min*(30-2.5);
              if(angle>360)
              {
                angle=angle%360;
              }
              if(angle>180)
              {
                angle=360-angle;
              }
              System.out.println(H+":"+min*5+"-"+angle);
              
 }}}}
