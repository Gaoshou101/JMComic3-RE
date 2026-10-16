package M;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends P0.b {

    /* renamed from: m, reason: collision with root package name */
    public final TextView f426m;

    /* renamed from: n, reason: collision with root package name */
    public final d f427n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f428o = true;

    public f(TextView textView) {
        this.f426m = textView;
        this.f427n = new d(textView);
    }

    @Override // P0.b
    public final void A(boolean z2) {
        if (z2) {
            K();
        }
    }

    @Override // P0.b
    public final void B(boolean z2) {
        this.f428o = z2;
        K();
        TextView textView = this.f426m;
        textView.setFilters(o(textView.getFilters()));
    }

    public final void K() {
        TextView textView = this.f426m;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f428o) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f434a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // P0.b
    public final InputFilter[] o(InputFilter[] inputFilterArr) {
        if (!this.f428o) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof d) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i5 = 0;
        while (true) {
            d dVar = this.f427n;
            if (i5 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i5] == dVar) {
                return inputFilterArr;
            }
            i5++;
        }
    }
}
