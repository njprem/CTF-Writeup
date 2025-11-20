package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002\u001aX\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u001a\u001a\u0010\u001a\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u001a\r\u0010\u001e\u001a\u00020\t*\u00020\tH\u0082\b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u001f"}, d2 = {"EmptyArray", "", "getEmptyArray", "()[F", "arcToBezier", "", "p", "Landroidx/compose/ui/graphics/Path;", "cx", "", "cy", "a", "b", "e1x", "e1y", "theta", "start", "sweep", "drawArc", "x0", "y0", "x1", "y1", "isMoreThanHalf", "", "isPositiveArc", "toPath", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "target", "toRadians", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathParserKt {
    private static final float[] EmptyArray = new float[0];

    private static final void arcToBezier(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        double d11 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d10 * d11) / 3.141592653589793d));
        double dCos = Math.cos(d8);
        double dSin = Math.sin(d8);
        double dCos2 = Math.cos(d9);
        double dSin2 = Math.sin(d9);
        double d12 = -d4;
        double d13 = d12 * dCos;
        double d14 = d5 * dSin;
        double d15 = (d13 * dSin2) - (d14 * dCos2);
        double d16 = d12 * dSin;
        double d17 = d5 * dCos;
        double d18 = (dCos2 * d17) + (dSin2 * d16);
        double d19 = d10 / iCeil;
        double d20 = d18;
        double d21 = d15;
        int i2 = 0;
        double d22 = d6;
        double d23 = d7;
        double d24 = d9;
        while (i2 < iCeil) {
            double d25 = d24 + d19;
            double dSin3 = Math.sin(d25);
            double dCos3 = Math.cos(d25);
            int i3 = i2;
            double d26 = (((d4 * dCos) * dCos3) + d2) - (d14 * dSin3);
            double d27 = d11;
            double d28 = (d17 * dSin3) + (d4 * dSin * dCos3) + d3;
            double d29 = (d13 * dSin3) - (d14 * dCos3);
            double d30 = (dCos3 * d17) + (dSin3 * d16);
            double d31 = d25 - d24;
            int i4 = iCeil;
            double dTan = Math.tan(d31 / 2);
            double dSqrt = ((Math.sqrt(((3.0d * dTan) * dTan) + d27) - 1) * Math.sin(d31)) / 3;
            path.cubicTo((float) ((d21 * dSqrt) + d22), (float) ((d20 * dSqrt) + d23), (float) (d26 - (dSqrt * d29)), (float) (d28 - (dSqrt * d30)), (float) d26, (float) d28);
            dSin = dSin;
            d19 = d19;
            d22 = d26;
            d23 = d28;
            i2 = i3 + 1;
            d24 = d25;
            d20 = d30;
            iCeil = i4;
            d21 = d29;
            dCos = dCos;
            d11 = d27;
        }
    }

    private static final void drawArc(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = (d8 / 180) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d3 * dSin) + (d2 * dCos)) / d6;
        double d13 = ((d3 * dCos) + ((-d2) * dSin)) / d7;
        double d14 = ((d5 * dSin) + (d4 * dCos)) / d6;
        double d15 = ((d5 * dCos) + ((-d4) * dSin)) / d7;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d17 * d17) + (d16 * d16);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            drawArc(path, d2, d3, d4, d5, d6 * dSqrt, d7 * dSqrt, d8, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d16 * dSqrt2;
        double d24 = dSqrt2 * d17;
        if (z == z2) {
            d9 = d19 - d24;
            d10 = d20 + d23;
        } else {
            d9 = d19 + d24;
            d10 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d13 - d10, d12 - d9);
        double dAtan22 = Math.atan2(d15 - d10, d14 - d9) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d25 = d9 * d6;
        double d26 = d10 * d7;
        arcToBezier(path, (d25 * dCos) - (d26 * dSin), (d26 * dCos) + (d25 * dSin), d6, d7, d2, d3, d11, dAtan2, dAtan22);
    }

    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    public static final Path toPath(List<? extends PathNode> list, Path path) {
        int i2;
        float f2;
        int i3;
        PathNode pathNode;
        float f3;
        float f4;
        float x1;
        float y1;
        float x2;
        float y2;
        float dy2;
        float f5;
        float f6;
        float dx1;
        float dy1;
        float dx2;
        float dy22;
        float y3;
        float y4;
        float x3;
        float x4;
        float y5;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int iMo3683getFillTypeRgk1Os = path2.mo3683getFillTypeRgk1Os();
        path2.rewind();
        path2.mo3685setFillTypeoQ8Xj4U(iMo3683getFillTypeRgk1Os);
        PathNode pathNode2 = list2.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list2.size();
        float f7 = 0.0f;
        int i4 = 0;
        float arcStartX = 0.0f;
        float arcStartY = 0.0f;
        float x5 = 0.0f;
        float y6 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        while (i4 < size) {
            PathNode pathNode3 = list2.get(i4);
            if (pathNode3 instanceof PathNode.Close) {
                path2.close();
                i2 = size;
                f2 = f7;
                i3 = i4;
                pathNode = pathNode3;
                arcStartX = f8;
                x5 = arcStartX;
                arcStartY = f9;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x4 = relativeMoveTo.getDx() + x5;
                    y5 = relativeMoveTo.getDy() + y6;
                    path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                } else if (pathNode3 instanceof PathNode.MoveTo) {
                    PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                    x4 = moveTo.getX();
                    y5 = moveTo.getY();
                    path2.moveTo(moveTo.getX(), moveTo.getY());
                } else {
                    if (pathNode3 instanceof PathNode.RelativeLineTo) {
                        PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                        path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                        x2 = relativeLineTo.getDx() + x5;
                        dy2 = relativeLineTo.getDy();
                    } else {
                        if (pathNode3 instanceof PathNode.LineTo) {
                            PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                            path2.lineTo(lineTo.getX(), lineTo.getY());
                            x2 = lineTo.getX();
                            y2 = lineTo.getY();
                        } else {
                            if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                path2.relativeLineTo(relativeHorizontalTo.getDx(), f7);
                                x3 = relativeHorizontalTo.getDx() + x5;
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                path2.lineTo(horizontalTo.getX(), y6);
                                x3 = horizontalTo.getX();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                    PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                    path2.relativeLineTo(f7, relativeVerticalTo.getDy());
                                    y4 = relativeVerticalTo.getDy() + y6;
                                } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                    PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                    path2.lineTo(x5, verticalTo.getY());
                                    y4 = verticalTo.getY();
                                } else {
                                    if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                        PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                        path2.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                        dx1 = relativeCurveTo.getDx2() + x5;
                                        dy1 = relativeCurveTo.getDy2() + y6;
                                        dx2 = relativeCurveTo.getDx3() + x5;
                                        dy22 = relativeCurveTo.getDy3();
                                    } else if (pathNode3 instanceof PathNode.CurveTo) {
                                        PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                                        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        dx1 = curveTo.getX2();
                                        dy1 = curveTo.getY2();
                                        dx2 = curveTo.getX3();
                                        y3 = curveTo.getY3();
                                        x5 = dx2;
                                        y6 = y3;
                                        i2 = size;
                                        f2 = f7;
                                        i3 = i4;
                                        pathNode = pathNode3;
                                        arcStartX = dx1;
                                        arcStartY = dy1;
                                        i4 = i3 + 1;
                                        path2 = path;
                                        pathNode2 = pathNode;
                                        f7 = f2;
                                        size = i2;
                                        list2 = list;
                                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                                        if (pathNode2.getIsCurve()) {
                                            float f10 = x5 - arcStartX;
                                            f6 = y6 - arcStartY;
                                            f5 = f10;
                                        } else {
                                            f5 = f7;
                                            f6 = f5;
                                        }
                                        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                                        path.relativeCubicTo(f5, f6, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        dx1 = relativeReflectiveCurveTo.getDx1() + x5;
                                        dy1 = relativeReflectiveCurveTo.getDy1() + y6;
                                        dx2 = relativeReflectiveCurveTo.getDx2() + x5;
                                        dy22 = relativeReflectiveCurveTo.getDy2();
                                    } else {
                                        if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                                            if (pathNode2.getIsCurve()) {
                                                float f11 = 2;
                                                x5 = (x5 * f11) - arcStartX;
                                                y6 = (f11 * y6) - arcStartY;
                                            }
                                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                                            path.cubicTo(x5, y6, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            x1 = reflectiveCurveTo.getX1();
                                            y1 = reflectiveCurveTo.getY1();
                                            float x22 = reflectiveCurveTo.getX2();
                                            float y22 = reflectiveCurveTo.getY2();
                                            x5 = x22;
                                            y6 = y22;
                                        } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                                            path.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            arcStartX = relativeQuadTo.getDx1() + x5;
                                            arcStartY = relativeQuadTo.getDy1() + y6;
                                            x2 = relativeQuadTo.getDx2() + x5;
                                            dy2 = relativeQuadTo.getDy2();
                                        } else if (pathNode3 instanceof PathNode.QuadTo) {
                                            PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode3;
                                            path.quadraticTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                            arcStartX = quadTo.getX1();
                                            arcStartY = quadTo.getY1();
                                            x2 = quadTo.getX2();
                                            y2 = quadTo.getY2();
                                        } else if (pathNode3 instanceof PathNode.RelativeReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                f3 = x5 - arcStartX;
                                                f4 = y6 - arcStartY;
                                            } else {
                                                f3 = f7;
                                                f4 = f3;
                                            }
                                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                            path.relativeQuadraticTo(f3, f4, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            x1 = f3 + x5;
                                            y1 = f4 + y6;
                                            float dx = relativeReflectiveQuadTo.getDx() + x5;
                                            y6 = relativeReflectiveQuadTo.getDy() + y6;
                                            x5 = dx;
                                        } else {
                                            if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                                if (pathNode2.getIsQuad()) {
                                                    float f12 = 2;
                                                    x5 = (x5 * f12) - arcStartX;
                                                    y6 = (f12 * y6) - arcStartY;
                                                }
                                                PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                                path.quadraticTo(x5, y6, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                                float f13 = x5;
                                                x5 = reflectiveQuadTo.getX();
                                                arcStartX = f13;
                                                i2 = size;
                                                f2 = f7;
                                                i3 = i4;
                                                arcStartY = y6;
                                                pathNode = pathNode3;
                                                y6 = reflectiveQuadTo.getY();
                                            } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                                PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                                float arcStartDx = relativeArcTo.getArcStartDx() + x5;
                                                float arcStartDy = relativeArcTo.getArcStartDy() + y6;
                                                pathNode = pathNode3;
                                                i2 = size;
                                                i3 = i4;
                                                f2 = f7;
                                                drawArc(path, x5, y6, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                                arcStartX = arcStartDx;
                                                x5 = arcStartX;
                                                arcStartY = arcStartDy;
                                            } else {
                                                i2 = size;
                                                f2 = f7;
                                                i3 = i4;
                                                pathNode = pathNode3;
                                                if (pathNode instanceof PathNode.ArcTo) {
                                                    PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                                    drawArc(path, x5, y6, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                                    arcStartX = arcTo.getArcStartX();
                                                    x5 = arcStartX;
                                                    arcStartY = arcTo.getArcStartY();
                                                }
                                            }
                                            i4 = i3 + 1;
                                            path2 = path;
                                            pathNode2 = pathNode;
                                            f7 = f2;
                                            size = i2;
                                            list2 = list;
                                        }
                                        i2 = size;
                                        f2 = f7;
                                        i3 = i4;
                                        pathNode = pathNode3;
                                        arcStartY = y1;
                                        arcStartX = x1;
                                        i4 = i3 + 1;
                                        path2 = path;
                                        pathNode2 = pathNode;
                                        f7 = f2;
                                        size = i2;
                                        list2 = list;
                                    }
                                    y3 = dy22 + y6;
                                    x5 = dx2;
                                    y6 = y3;
                                    i2 = size;
                                    f2 = f7;
                                    i3 = i4;
                                    pathNode = pathNode3;
                                    arcStartX = dx1;
                                    arcStartY = dy1;
                                    i4 = i3 + 1;
                                    path2 = path;
                                    pathNode2 = pathNode;
                                    f7 = f2;
                                    size = i2;
                                    list2 = list;
                                }
                                y6 = y4;
                                i2 = size;
                                f2 = f7;
                                i3 = i4;
                                pathNode = pathNode3;
                                i4 = i3 + 1;
                                path2 = path;
                                pathNode2 = pathNode;
                                f7 = f2;
                                size = i2;
                                list2 = list;
                            }
                            x5 = x3;
                            i2 = size;
                            f2 = f7;
                            i3 = i4;
                            pathNode = pathNode3;
                            i4 = i3 + 1;
                            path2 = path;
                            pathNode2 = pathNode;
                            f7 = f2;
                            size = i2;
                            list2 = list;
                        }
                        y6 = y2;
                        x5 = x2;
                        i2 = size;
                        f2 = f7;
                        i3 = i4;
                        pathNode = pathNode3;
                        i4 = i3 + 1;
                        path2 = path;
                        pathNode2 = pathNode;
                        f7 = f2;
                        size = i2;
                        list2 = list;
                    }
                    y2 = dy2 + y6;
                    y6 = y2;
                    x5 = x2;
                    i2 = size;
                    f2 = f7;
                    i3 = i4;
                    pathNode = pathNode3;
                    i4 = i3 + 1;
                    path2 = path;
                    pathNode2 = pathNode;
                    f7 = f2;
                    size = i2;
                    list2 = list;
                }
                x5 = x4;
                f8 = x5;
                y6 = y5;
                f9 = y6;
                i2 = size;
                f2 = f7;
                i3 = i4;
                pathNode = pathNode3;
                i4 = i3 + 1;
                path2 = path;
                pathNode2 = pathNode;
                f7 = f2;
                size = i2;
                list2 = list;
            }
            y6 = arcStartY;
            i4 = i3 + 1;
            path2 = path;
            pathNode2 = pathNode;
            f7 = f2;
            size = i2;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    private static final double toRadians(double d2) {
        return (d2 / 180) * 3.141592653589793d;
    }
}
