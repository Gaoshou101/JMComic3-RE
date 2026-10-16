package com.capacitorjs.plugins.preferences;

import android.content.SharedPreferences;
import b0.C0083a;
import b0.C0084b;
import c0.InterfaceC0095b;
import com.getcapacitor.D;
import com.getcapacitor.E;
import com.getcapacitor.I;
import com.getcapacitor.u;
import com.getcapacitor.w;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC0095b(name = "Preferences")
/* loaded from: classes.dex */
public class PreferencesPlugin extends D {
    private C0083a preferences;

    @I
    public void clear(E e2) {
        SharedPreferences.Editor editorEdit = this.preferences.f1328a.edit();
        editorEdit.clear();
        editorEdit.apply();
        e2.g();
    }

    @I
    public void configure(E e2) {
        try {
            C0084b c0084b = C0084b.f1329b;
            C0084b c0084bA = c0084b.a();
            c0084bA.f1330a = e2.e("group", c0084b.f1330a);
            this.preferences = new C0083a(getContext(), c0084bA);
            e2.g();
        } catch (CloneNotSupportedException e3) {
            e2.f("Error while configuring", null, e3);
        }
    }

    @I
    public void get(E e2) throws JSONException {
        String strE = e2.e("key", null);
        if (strE == null) {
            e2.f("Must provide key", null, null);
            return;
        }
        Object string = this.preferences.f1328a.getString(strE, null);
        w wVar = new w();
        if (string == null) {
            string = JSONObject.NULL;
        }
        wVar.d("value", string);
        e2.h(wVar);
    }

    @I
    public void keys(E e2) {
        String[] strArr = (String[]) this.preferences.f1328a.getAll().keySet().toArray(new String[0]);
        w wVar = new w();
        try {
            wVar.d("keys", new u(strArr));
            e2.h(wVar);
        } catch (JSONException e3) {
            e2.f("Unable to serialize response.", null, e3);
        }
    }

    @Override // com.getcapacitor.D
    public void load() {
        this.preferences = new C0083a(getContext(), C0084b.f1329b);
    }

    @I
    public void migrate(E e2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(C0084b.f1329b.f1330a, 0);
        for (String str : sharedPreferences.getAll().keySet()) {
            String string = sharedPreferences.getString(str, null);
            if (this.preferences.f1328a.getString(str, null) == null) {
                SharedPreferences.Editor editorEdit = this.preferences.f1328a.edit();
                editorEdit.putString(str, string);
                editorEdit.apply();
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        w wVar = new w();
        wVar.d("migrated", new u(arrayList));
        wVar.d("existing", new u(arrayList2));
        e2.h(wVar);
    }

    @I
    public void remove(E e2) {
        String strE = e2.e("key", null);
        if (strE == null) {
            e2.f("Must provide key", null, null);
            return;
        }
        SharedPreferences.Editor editorEdit = this.preferences.f1328a.edit();
        editorEdit.remove(strE);
        editorEdit.apply();
        e2.g();
    }

    @I
    public void removeOld(E e2) {
        e2.g();
    }

    @I
    public void set(E e2) {
        String strE = e2.e("key", null);
        if (strE == null) {
            e2.f("Must provide key", null, null);
            return;
        }
        String strE2 = e2.e("value", null);
        SharedPreferences.Editor editorEdit = this.preferences.f1328a.edit();
        editorEdit.putString(strE, strE2);
        editorEdit.apply();
        e2.g();
    }
}
