package N0;

import android.content.Intent;
import g.AbstractActivityC0137i;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public interface m {
    AbstractActivityC0137i getActivity();

    ExecutorService getThreadPool();

    Object onMessage(String str, Object obj);

    void startActivityForResult(o oVar, Intent intent, int i2);
}
