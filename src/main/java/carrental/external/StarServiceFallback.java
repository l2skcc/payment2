
package carrental.external;

public class StarServiceFallback implements StarService {

    @Override
    public void star(Star star) {
        //do nothing if you want to forgive it

        System.out.println("Circuit breaker has been opened. Fallback returned instead.");
    }

    @Override
    public void starCanceled(Star star) {
        //do nothing if you want to forgive it

        System.out.println("Circuit breaker has been opened. Fallback returned instead.");
    }
}
