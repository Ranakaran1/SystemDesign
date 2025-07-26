public abstract class LogProcessor{

    public static int INFO =1;
    public static int ERROR = 2;
    public static int DEBUG = 3;

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor next){
        this.nextLogProcessor = next;
    }

    public void log(int loglevel, String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(loglevel, message);
        }
    }

}