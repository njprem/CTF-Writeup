package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J-\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u0004R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u0004\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "finalPosition", "", "(F)V", "dampedFreq", "", "value", "dampingRatio", "getDampingRatio", "()F", "setDampingRatio", "getFinalPosition", "setFinalPosition", "gammaMinus", "gammaPlus", "initialized", "", "naturalFreq", "stiffness", "getStiffness", "setStiffness", "getAcceleration", "lastDisplacement", "lastVelocity", "init", "", "updateValues", "Landroidx/compose/animation/core/Motion;", "timeElapsed", "", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpringSimulation {
    public static final int $stable = 8;
    private double dampedFreq;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f2) {
        this.finalPosition = f2;
    }

    private final void init() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == SpringSimulationKt.getUNSET()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f2 = this.dampingRatio;
        double d2 = f2 * f2;
        if (f2 > 1.0f) {
            double d3 = this.naturalFreq;
            double d4 = d2 - 1;
            this.gammaPlus = (Math.sqrt(d4) * d3) + ((-f2) * d3);
            double d5 = -this.dampingRatio;
            double d6 = this.naturalFreq;
            this.gammaMinus = (d5 * d6) - (Math.sqrt(d4) * d6);
        } else if (f2 >= 0.0f && f2 < 1.0f) {
            this.dampedFreq = Math.sqrt(1 - d2) * this.naturalFreq;
        }
        this.initialized = true;
    }

    public final float getAcceleration(float lastDisplacement, float lastVelocity) {
        float f2 = lastDisplacement - this.finalPosition;
        double d2 = this.naturalFreq;
        return (float) (((-(d2 * d2)) * f2) - (((d2 * 2.0d) * this.dampingRatio) * lastVelocity));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d2 = this.naturalFreq;
        return (float) (d2 * d2);
    }

    public final void setDampingRatio(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f2;
        this.initialized = false;
    }

    public final void setFinalPosition(float f2) {
        this.finalPosition = f2;
    }

    public final void setStiffness(float f2) {
        if (getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f2);
        this.initialized = false;
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m131updateValuesIJZedt4$animation_core_release(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dCos;
        double dExp;
        double dExp2;
        double dExp3;
        init();
        float f2 = lastDisplacement - this.finalPosition;
        double d2 = timeElapsed / 1000.0d;
        float f3 = this.dampingRatio;
        if (f3 > 1.0f) {
            double d3 = f2;
            double d4 = this.gammaMinus;
            double d5 = lastVelocity;
            double d6 = this.gammaPlus;
            double d7 = d3 - (((d4 * d3) - d5) / (d4 - d6));
            double d8 = ((d3 * d4) - d5) / (d4 - d6);
            dExp = (Math.exp(this.gammaPlus * d2) * d8) + (Math.exp(d4 * d2) * d7);
            double d9 = this.gammaMinus;
            dExp2 = Math.exp(d9 * d2) * d7 * d9;
            double d10 = this.gammaPlus;
            dExp3 = Math.exp(d10 * d2) * d8 * d10;
        } else {
            if (f3 != 1.0f) {
                double d11 = 1 / this.dampedFreq;
                double d12 = this.naturalFreq;
                double d13 = f2;
                double d14 = ((f3 * d12 * d13) + lastVelocity) * d11;
                double dExp4 = Math.exp((-f3) * d12 * d2) * ((Math.sin(this.dampedFreq * d2) * d14) + (Math.cos(this.dampedFreq * d2) * d13));
                double d15 = this.naturalFreq;
                double d16 = (-d15) * dExp4 * this.dampingRatio;
                double dExp5 = Math.exp((-r7) * d15 * d2);
                double d17 = this.dampedFreq;
                double dSin = Math.sin(d17 * d2) * (-d17) * d13;
                double d18 = this.dampedFreq;
                dCos = (((Math.cos(d18 * d2) * d14 * d18) + dSin) * dExp5) + d16;
                dExp = dExp4;
                return SpringSimulationKt.Motion((float) (dExp + this.finalPosition), (float) dCos);
            }
            double d19 = this.naturalFreq;
            double d20 = f2;
            double d21 = (d19 * d20) + lastVelocity;
            double d22 = (d21 * d2) + d20;
            dExp = Math.exp((-d19) * d2) * d22;
            double dExp6 = Math.exp((-this.naturalFreq) * d2) * d22;
            double d23 = this.naturalFreq;
            dExp2 = dExp6 * (-d23);
            dExp3 = Math.exp((-d23) * d2) * d21;
        }
        dCos = dExp3 + dExp2;
        return SpringSimulationKt.Motion((float) (dExp + this.finalPosition), (float) dCos);
    }
}
