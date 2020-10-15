# liujiayang
实验2

## 实验目的
用类描述计算机中CPU的速度和硬盘容量

## 实验方法
1.阅读书上例子7-9
2.用eclipse进行编程
3.上传至github并撰写报告

## 实验过程
1.创建project，并在其下创建package，在package下创建CPU、PC、Test、HArdDisk四个class，根据需求分别将四个功能写入。
2.将Test作为主类，在其中进行其他类形参和实参的对应和输出。
3.在main方法中创建一个CPU对象cpu，cpu将自己的speed设置为3000
4.在main方法中创建一个HardDisk对象disk，disk将自己的amount设置为500
5.用相同方法在CPU和HardDisk中创建对象“CPU核数”“硬盘转速”
5.main方法创建一个PC对象pc
6.pc调用setCPU(CPU c)方法，调用时实参是cpu
7.pc调用setHardDisk(HardDisk h)方法，调用时实参是disk
8.pc调用show()方法

## 核心方法
'''
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
'''

## 实验结果
CPU的转速3000
CPU的核数8
硬盘的容量500
硬盘的转速7200

## 实验感想
经过这次实验，我熟悉了面向对象的编程方法，明确了形参与实参的关系，可以实现一对一的数据传入/输出，并且熟练掌握了project package和class的用法。
