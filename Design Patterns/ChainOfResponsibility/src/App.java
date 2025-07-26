public class App {
    public static void main(String[] args) throws Exception {
        LogProcessor logProcessor = new DebugLogProcessor(new ErrorLogProcessor(new InfoLogProcessor(null)));
        logProcessor.log(LogProcessor.INFO,"I am 2" );
    }
}
