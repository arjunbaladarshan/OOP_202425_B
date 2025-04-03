class ProducerConsumer{
    int capacity = 10;
    int current = 5;
    public synchronized void produce(){
        if(current>8){
            try{
                wait();
            }catch(Exception e){e.printStackTrace();}
        }
        current++;
        try{
            notify();
        }catch(Exception e){e.printStackTrace();}
        System.out.println("New Item Produced, current = "+current);
    }

    public synchronized void consume(){
        if(current<2){
            try{
                wait();
            }catch(Exception e){e.printStackTrace();}
        }
        current--;
        try{
            notify();
        }catch(Exception e){e.printStackTrace();}
        System.out.println("New Item Consumed, current = "+current);
    }
}

public class DemoProducerConsumer{
    public static void main(String[] args){
        ProducerConsumer pc = new ProducerConsumer();
        Thread threadConsumer = new Thread(new Runnable(){
            public void run(){
                while(true){
                    pc.consume();
                    try{
                        Thread.sleep((int)(Math.random()*2000));
                    }catch(Exception e){e.printStackTrace();}
                }
            }
        });

        Thread threadProducer = new Thread(new Runnable(){
            public void run(){
                while(true){
                    pc.produce();
                    try{
                        Thread.sleep((int)(Math.random()*2000));
                    }catch(Exception e){e.printStackTrace();}
                }
            }
        });

        threadConsumer.start();
        threadProducer.start();
    }
}