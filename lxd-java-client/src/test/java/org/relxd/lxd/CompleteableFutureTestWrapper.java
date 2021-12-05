package org.relxd.lxd;

import org.relxd.lxd.client.ApiException;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.TimeUnit;

public interface CompleteableFutureTestWrapper {

    default <T> T $(CompletableFuture<T> in) throws ApiException {
        try {
            in.orTimeout(10, TimeUnit.SECONDS).join();

            return in.get();
        }  catch (CompletionException completionException){
            if(completionException.getCause().getClass().isAssignableFrom(ApiException.class)){
                var reason = (ApiException) completionException.getCause();
                throw reason;
            }
            else
                throw new ApiException(completionException.getCause());
        } catch (Throwable e) {
            throw new ApiException(e);
        }
    }
}
