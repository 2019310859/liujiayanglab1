package pack1;

 public class Text {
 public static void main(String args[]){
  
  CPU cpu =new CPU();
  
  cpu.setSpeed(3000);
  cpu.setCores(8);
  
  HardDisk disk=new HardDisk();
  
  disk.setAmount(500);
  disk.setSpeed(7200);
  
  PC pc=new PC();
  pc.setCPU(cpu);
  pc.setHardDisk(disk);
pc.show();
  
 }

}
 
 class CPU {
  int speed,cores;
  int getSpeed(){
   return speed;
  }
  int getCores(){
   return cores;
  }
  public void setSpeed(int speed){
   this.speed=speed;
  }
  public void setCores(int cores){
   this.cores=cores;
  }

 }
 
class HardDisk {
  int amount,speed;
  int getAmount(){
   return amount;
  }
  int getSpeed(){
   return speed;
  }
  public void setAmount(int amount){
   this.amount=amount;
  }
  public void setSpeed(int speed){
	   this.speed=speed;
  }

 }
 
 class PC {
  CPU cpu;
  HardDisk disk;
  void setCPU(CPU cpu){
   this.cpu=cpu;
  }
  void setHardDisk(HardDisk disk){
   this.disk=disk; 
  }
  void show(){
   System.out.println("CPUת�٣�ת/�룩��"+cpu.getSpeed());
   System.out.println("CPU������"+cpu.getCores());
   System.out.println("Ӳ��������GB����"+disk.getAmount());
   System.out.println("Ӳ��ת�٣�ת/�룩��"+disk.getSpeed());
  }

 }