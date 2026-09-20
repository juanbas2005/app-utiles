package defpackage;

import android.speech.tts.TextToSpeech;
import java.util.Locale;

/* renamed from: n78  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n78 implements TextToSpeech.OnInitListener {
    public TextToSpeech a;
    public boolean b;

    public final void onInit(int i) {
        Integer num;
        TextToSpeech textToSpeech = this.a;
        if (i == 0) {
            if (textToSpeech != null) {
                num = Integer.valueOf(textToSpeech.setLanguage(new Locale("es", "CU")));
            } else {
                num = null;
            }
            if (((num != null && num.intValue() == -1) || (num != null && num.intValue() == -2)) && textToSpeech != null) {
                textToSpeech.setLanguage(new Locale("es"));
            }
            if (textToSpeech != null) {
                textToSpeech.setSpeechRate(1.2f);
            }
            this.b = true;
        }
    }
}
