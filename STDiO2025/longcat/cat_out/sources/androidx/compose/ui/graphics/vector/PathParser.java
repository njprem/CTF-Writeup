package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ8\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\u0011\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082\bJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0010\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "()V", "nodeData", "", "nodes", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "addPathNodes", "", "clear", "", "parsePathString", "pathData", "", "pathStringToNodes", "resizeNodeData", "dataCount", "", "toNodes", "toPath", "Landroidx/compose/ui/graphics/Path;", "target", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathParser {
    private float[] nodeData = new float[64];
    private ArrayList<PathNode> nodes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList pathStringToNodes$default(PathParser pathParser, String str, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return pathParser.pathStringToNodes(str, arrayList);
    }

    private final void resizeNodeData(int dataCount) {
        float[] fArr = this.nodeData;
        if (dataCount >= fArr.length) {
            float[] fArr2 = new float[dataCount * 2];
            this.nodeData = fArr2;
            ArraysKt___ArraysJvmKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    public final PathParser addPathNodes(List<? extends PathNode> nodes) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        }
        arrayList.addAll(nodes);
        return this;
    }

    public final void clear() {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final PathParser parsePathString(String pathData) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        } else {
            arrayList.clear();
        }
        pathStringToNodes(pathData, arrayList);
        return this;
    }

    public final ArrayList<PathNode> pathStringToNodes(String pathData, ArrayList<PathNode> nodes) {
        int i2;
        char cCharAt;
        int i3;
        int length = pathData.length();
        int i4 = 0;
        while (i4 < length && Intrinsics.compare((int) pathData.charAt(i4), 32) <= 0) {
            i4++;
        }
        while (length > i4 && Intrinsics.compare((int) pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i5 = 0;
        while (i4 < length) {
            while (true) {
                i2 = i4 + 1;
                cCharAt = pathData.charAt(i4);
                int i6 = cCharAt | ' ';
                if ((i6 - 122) * (i6 - 97) <= 0 && i6 != 101) {
                    break;
                }
                if (i2 >= length) {
                    cCharAt = 0;
                    break;
                }
                i4 = i2;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i5 = 0;
                    while (true) {
                        if (i2 >= length || Intrinsics.compare((int) pathData.charAt(i2), 32) > 0) {
                            long jNextFloat = FastFloatParserKt.nextFloat(pathData, i2, length);
                            i3 = (int) (jNextFloat >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jNextFloat & 4294967295L));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i7 = i5 + 1;
                                fArr[i5] = fIntBitsToFloat;
                                if (i7 >= fArr.length) {
                                    float[] fArr2 = new float[i7 * 2];
                                    this.nodeData = fArr2;
                                    ArraysKt___ArraysJvmKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i5 = i7;
                            }
                            while (i3 < length && pathData.charAt(i3) == ',') {
                                i3++;
                            }
                            if (i3 >= length || Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            i2++;
                        }
                    }
                    i2 = i3;
                }
                PathNodeKt.addPathNodes(cCharAt, nodes, this.nodeData, i5);
            }
            i4 = i2;
        }
        return nodes;
    }

    public final List<PathNode> toNodes() {
        ArrayList<PathNode> arrayList = this.nodes;
        return arrayList != null ? arrayList : CollectionsKt.emptyList();
    }

    public final Path toPath(Path target) {
        Path path;
        ArrayList<PathNode> arrayList = this.nodes;
        return (arrayList == null || (path = PathParserKt.toPath(arrayList, target)) == null) ? AndroidPath_androidKt.Path() : path;
    }
}
