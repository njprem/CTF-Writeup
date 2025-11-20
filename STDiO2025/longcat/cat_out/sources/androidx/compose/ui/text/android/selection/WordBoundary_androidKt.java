package androidx.compose.ui.text.android.selection;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"getWordEnd", "", "Landroidx/compose/ui/text/android/selection/WordIterator;", "offset", "getWordStart", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WordBoundary_androidKt {
    public static final int getWordEnd(WordIterator wordIterator, int i2) {
        int punctuationEnd = wordIterator.isAfterPunctuation(wordIterator.nextBoundary(i2)) ? wordIterator.getPunctuationEnd(i2) : wordIterator.getNextWordEndOnTwoWordBoundary(i2);
        return punctuationEnd == -1 ? i2 : punctuationEnd;
    }

    public static final int getWordStart(WordIterator wordIterator, int i2) {
        int punctuationBeginning = wordIterator.isOnPunctuation(wordIterator.prevBoundary(i2)) ? wordIterator.getPunctuationBeginning(i2) : wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i2);
        return punctuationBeginning == -1 ? i2 : punctuationBeginning;
    }
}
