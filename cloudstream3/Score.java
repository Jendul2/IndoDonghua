/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonAutoDetect
 *  com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.math.MathKt
 *  kotlin.text.CharsKt
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lagradost.api.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003J\u0010\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\r\u001a\u00020\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\r\u001a\u00020\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J6\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ,\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2={"Lcom/lagradost/cloudstream3/Score;", "", "data", "", "<init>", "(I)V", "hashCode", "equals", "", "other", "toOld", "toByte", "", "maxScore", "toInt", "toLong", "", "toFloat", "", "toDouble", "", "toString", "", "toStringNull", "minScore", "decimals", "removeTrailingZeros", "decimalChar", "", "Companion", "library"})
public final class Score {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int data;
    public static final int MAX = 1000000000;
    public static final int MIN = 0;
    public static final int MAX_ZEROS = 9;
    @NotNull
    private static final String TAG = "Score";

    private Score(@JsonProperty(value="data") int data2) {
        this.data = data2;
    }

    public int hashCode() {
        return Integer.hashCode(this.data);
    }

    public boolean equals(@Nullable Object other) {
        return other instanceof Score && this.data == ((Score)other).data;
    }

    public final int toOld() {
        return this.toInt(10000);
    }

    public final byte toByte(int maxScore) {
        return (byte)this.toLong(maxScore);
    }

    public final int toInt(int maxScore) {
        return (int)this.toLong(maxScore);
    }

    public static /* synthetic */ int toInt$default(Score score2, int n, int n2, Object object) {
        if ((n2 & 1) != 0) {
            n = 10;
        }
        return score2.toInt(n);
    }

    public final long toLong(int maxScore) {
        return (long)this.data * (long)maxScore / 1000000000L;
    }

    public static /* synthetic */ long toLong$default(Score score2, int n, int n2, Object object) {
        if ((n2 & 1) != 0) {
            n = 10;
        }
        return score2.toLong(n);
    }

    public final float toFloat(int maxScore) {
        return (float)this.data / 1.0E9f * (float)maxScore;
    }

    public static /* synthetic */ float toFloat$default(Score score2, int n, int n2, Object object) {
        if ((n2 & 1) != 0) {
            n = 10;
        }
        return score2.toFloat(n);
    }

    public final double toDouble(int maxScore) {
        return (double)this.data / 1.0E9 * (double)maxScore;
    }

    public static /* synthetic */ double toDouble$default(Score score2, int n, int n2, Object object) {
        if ((n2 & 1) != 0) {
            n = 10;
        }
        return score2.toDouble(n);
    }

    @NotNull
    public String toString() {
        return Score.toString$default(this, 10, 0, false, '\u0000', 14, null);
    }

    @Nullable
    public final String toStringNull(double minScore, int maxScore, int decimals, boolean removeTrailingZeros, char decimalChar) throws IllegalArgumentException {
        if (Score.toDouble$default(this, 0, 1, null) < minScore) {
            return null;
        }
        return this.toString(maxScore, decimals, removeTrailingZeros, decimalChar);
    }

    public static /* synthetic */ String toStringNull$default(Score score2, double d, int n, int n2, boolean bl, char c, int n3, Object object) throws IllegalArgumentException {
        if ((n3 & 4) != 0) {
            n2 = 1;
        }
        if ((n3 & 8) != 0) {
            bl = true;
        }
        if ((n3 & 0x10) != 0) {
            c = (char)46;
        }
        return score2.toStringNull(d, n, n2, bl, c);
    }

    @NotNull
    public final String toString(int maxScore, int decimals, boolean removeTrailingZeros, char decimalChar) throws IllegalArgumentException {
        int end;
        int i;
        if (!(1 <= maxScore ? maxScore < 1001 : false)) {
            boolean $i$a$-require-Score$toString$32 = false;
            String $i$a$-require-Score$toString$32 = "maxScore \u2208 [1,1000]";
            throw new IllegalArgumentException($i$a$-require-Score$toString$32.toString());
        }
        if (!(0 <= decimals ? decimals < 10 : false)) {
            boolean bl = false;
            String string2 = "decimals \u2208 [0,9]";
            throw new IllegalArgumentException(string2.toString());
        }
        long number = (long)this.data * (long)maxScore;
        char[] chars = new char[15];
        int n = chars.length;
        for (int i2 = 0; i2 < n; ++i2) {
            chars[i2] = CharsKt.digitToChar((int)((int)(number % 10L)));
            number /= 10L;
        }
        int trailingZeros = 0;
        int n2 = chars.length;
        for (int i3 = 0; i3 < n2 && chars[i3] == '0'; ++i3) {
            ++trailingZeros;
        }
        int leadingZeros = 0;
        n2 = chars.length + -1;
        if (0 <= n2) {
            while (chars[i = n2--] == '0') {
                ++leadingZeros;
                if (0 <= n2) continue;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (i = Math.max(9, chars.length - leadingZeros - 1); 8 < i; --i) {
            stringBuilder.append(chars[i]);
        }
        int n3 = end = removeTrailingZeros ? Math.max(9 - decimals, trailingZeros) : 9 - decimals;
        if (end <= 8) {
            stringBuilder.append(decimalChar);
            int i4 = 8;
            if (end <= i4) {
                while (true) {
                    stringBuilder.append(chars[i4]);
                    if (i4 == end) break;
                    --i4;
                }
            }
        }
        String string3 = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string3, (String)"toString(...)");
        return string3;
    }

    public static /* synthetic */ String toString$default(Score score2, int n, int n2, boolean bl, char c, int n3, Object object) throws IllegalArgumentException {
        if ((n3 & 2) != 0) {
            n2 = 1;
        }
        if ((n3 & 4) != 0) {
            bl = true;
        }
        if ((n3 & 8) != 0) {
            c = (char)46;
        }
        return score2.toString(n, n2, bl, c);
    }

    public /* synthetic */ Score(int data2, DefaultConstructorMarker $constructor_marker) {
        this(data2);
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0014J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0005J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0018J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0018J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0018J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0019J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0019J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0019J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2={"Lcom/lagradost/cloudstream3/Score$Companion;", "", "<init>", "()V", "MAX", "", "MIN", "MAX_ZEROS", "TAG", "", "fromOld", "Lcom/lagradost/cloudstream3/Score;", "value", "(Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/Score;", "from", "maxScore", "(Ljava/lang/Integer;I)Lcom/lagradost/cloudstream3/Score;", "", "(Ljava/lang/Double;I)Lcom/lagradost/cloudstream3/Score;", "", "(Ljava/lang/Float;I)Lcom/lagradost/cloudstream3/Score;", "from5", "from10", "from100", "(Ljava/lang/Double;)Lcom/lagradost/cloudstream3/Score;", "(Ljava/lang/Float;)Lcom/lagradost/cloudstream3/Score;", "library"})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final Score fromOld(@Nullable Integer value) {
            if (value == null) {
                return null;
            }
            if (value < 0 || value > 10000) {
                Log.INSTANCE.w(Score.TAG, "old: " + value + " \u2209 [0, 10000]");
                return null;
            }
            return new Score(value * 100000, null);
        }

        @Nullable
        public final Score from(@Nullable Integer value, int maxScore) {
            if (value == null) {
                return null;
            }
            if (value < 0 || value > maxScore) {
                Log.INSTANCE.w(Score.TAG, "fromInt: " + value + " \u2209 [0, " + maxScore + ']');
                return null;
            }
            return new Score(1000000000 / maxScore * value, null);
        }

        @Nullable
        public final Score from(@Nullable Double value, int maxScore) {
            if (value == null) {
                return null;
            }
            if (value < 0.0 || value > (double)maxScore) {
                Log.INSTANCE.w(Score.TAG, "fromDouble: " + value + " \u2209 [0.0, " + maxScore + ']');
                return null;
            }
            return new Score(MathKt.roundToInt((double)((double)(1000000000 / maxScore) * value)), null);
        }

        @Nullable
        public final Score from(@Nullable Float value, int maxScore) {
            if (value == null) {
                return null;
            }
            if ((double)value.floatValue() < 0.0 || value.floatValue() > (float)maxScore) {
                Log.INSTANCE.w(Score.TAG, "fromFloat: " + value + " \u2209 [0.0f, " + maxScore + ']');
                return null;
            }
            return new Score(MathKt.roundToInt((float)((float)(1000000000 / maxScore) * value.floatValue())), null);
        }

        @Nullable
        public final Score from(@Nullable String value, int maxScore) {
            Object object = value;
            return this.from(object != null && (object = ((Object)StringsKt.trim((CharSequence)((CharSequence)object))).toString()) != null && (object = StringsKt.toDoubleOrNull((String)object)) != null ? Double.valueOf(Math.abs((Double)object)) : null, maxScore);
        }

        @Nullable
        public final Score from5(@Nullable Integer value) {
            return this.from(value, 5);
        }

        @Nullable
        public final Score from10(@Nullable Integer value) {
            return this.from(value, 10);
        }

        @Nullable
        public final Score from100(@Nullable Integer value) {
            return this.from(value, 100);
        }

        @Nullable
        public final Score from5(@Nullable Double value) {
            return this.from(value, 5);
        }

        @Nullable
        public final Score from10(@Nullable Double value) {
            return this.from(value, 10);
        }

        @Nullable
        public final Score from100(@Nullable Double value) {
            return this.from(value, 100);
        }

        @Nullable
        public final Score from5(@Nullable Float value) {
            return this.from(value, 5);
        }

        @Nullable
        public final Score from10(@Nullable Float value) {
            return this.from(value, 10);
        }

        @Nullable
        public final Score from100(@Nullable Float value) {
            return this.from(value, 100);
        }

        @Nullable
        public final Score from5(@Nullable String value) {
            return this.from(value, 5);
        }

        @Nullable
        public final Score from10(@Nullable String value) {
            return this.from(value, 10);
        }

        @Nullable
        public final Score from100(@Nullable String value) {
            return this.from(value, 100);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

