package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("io.reactivex.exceptions.OnErrorNotImplementedException");
        System.out.println("io.reactivex.exceptions.OnErrorNotImplementedException: \n" +
                "  at io.reactivex.internal.functions.Functions$OnErrorMissingConsumer.accept (Functions.java:704)\n" +
                "  at io.reactivex.internal.functions.Functions$OnErrorMissingConsumer.accept (Functions.java:701)\n" +
                "  at io.reactivex.internal.observers.ConsumerSingleObserver.onError (ConsumerSingleObserver.java:47)\n" +
                "  at io.reactivex.internal.operators.single.SingleDoFinally$DoFinallyObserver.onError (SingleDoFinally.java:81)\n" +
                "  at io.reactivex.internal.operators.single.SingleDoAfterTerminate$DoAfterTerminateObserver.onError (SingleDoAfterTerminate.java:77)\n" +
                "  at io.reactivex.internal.operators.single.SingleDoOnSubscribe$DoOnSubscribeSingleObserver.onError (SingleDoOnSubscribe.java:86)\n" +
                "  at io.reactivex.internal.operators.single.SingleObserveOn$ObserveOnSingleObserver.run (SingleObserveOn.java:79)\n" +
                "  at io.reactivex.android.schedulers.HandlerScheduler$ScheduledRunnable.run (HandlerScheduler.java:109)\n" +
                "  at android.os.Handler.handleCallback (Handler.java:907)\n" +
                "  at android.os.Handler.dispatchMessage (Handler.java:105)\n" +
                "  at android.os.Looper.loop (Looper.java:216)\n" +
                "  at android.app.ActivityThread.main (ActivityThread.java:7625)\n" +
                "  at java.lang.reflect.Method.invoke (Native Method)\n" +
                "  at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run (RuntimeInit.java:524)\n" +
                "  at com.android.internal.os.ZygoteInit.main (ZygoteInit.java:987)\n" +
                "Caused by: retrofit2.adapter.rxjava2.HttpException: \n" +
                "  at retrofit2.adapter.rxjava2.BodyObservable$BodyObserver.onNext (BodyObservable.java:54)\n" +
                "  at retrofit2.adapter.rxjava2.BodyObservable$BodyObserver.onNext (BodyObservable.java:37)\n" +
                "  at retrofit2.adapter.rxjava2.CallExecuteObservable.subscribeActual (CallExecuteObservable.java:44)\n" +
                "  at io.reactivex.Observable.subscribe (Observable.java:12036)\n" +
                "  at retrofit2.adapter.rxjava2.BodyObservable.subscribeActual (BodyObservable.java:34)\n" +
                "  at io.reactivex.Observable.subscribe (Observable.java:12036)\n" +
                "  at io.reactivex.internal.operators.observable.ObservableSingleSingle.subscribeActual (ObservableSingleSingle.java:35)\n" +
                "  at io.reactivex.Single.subscribe (Single.java:3313)\n" +
                "  at io.reactivex.internal.operators.single.SingleSubscribeOn$SubscribeOnObserver.run (SingleSubscribeOn.java:89)\n" +
                "  at io.reactivex.Scheduler$DisposeTask.run (Scheduler.java:579)\n" +
                "  at io.reactivex.internal.schedulers.ScheduledRunnable.run (ScheduledRunnable.java:66)\n" +
                "  at io.reactivex.internal.schedulers.ScheduledRunnable.call (ScheduledRunnable.java:57)\n" +
                "  at java.util.concurrent.FutureTask.run (FutureTask.java:266)\n" +
                "  at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run (ScheduledThreadPoolExecutor.java:301)\n" +
                "  at java.util.concurrent.ThreadPoolExecutor.processTask (ThreadPoolExecutor.java:1187)\n" +
                "  at java.util.concurrent.ThreadPoolExecutor.runWorker (ThreadPoolExecutor.java:1152)\n" +
                "  at java.util.concurrent.ThreadPoolExecutor$Worker.run (ThreadPoolExecutor.java:641)\n" +
                "  at java.lang.Thread.run (Thread.java:784)");

    }
}
