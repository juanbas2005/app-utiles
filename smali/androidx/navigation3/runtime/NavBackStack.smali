.class public final Landroidx/navigation3/runtime/NavBackStack;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/List;
.implements Ln37;
.implements Ljava/util/RandomAccess;
.implements Lcr3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lvu4;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/List<",
        "TT;>;",
        "Ln37;",
        "Ljava/util/RandomAccess;",
        "Lcr3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\n\n\u0002\u0010+\n\u0002\u0008\u000e\n\u0002\u0010)\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0007\u0018\u0000 F*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00060\u0005j\u0002`\u0006:\u0001GB\u0015\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB\t\u0008\u0016\u00a2\u0006\u0004\u0008\t\u0010\u000bB\u001d\u0008\u0016\u0012\u0012\u0010\r\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u000c\"\u00028\u0000\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J \u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0012J\u001e\u0010\u0019\u001a\u00020\u00102\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ&\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00102\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00102\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0015H\u0096\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u000bJ \u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0018\u0010!\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00028\u00000#H\u0096\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001e\u0010$\u001a\u0008\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001\u00a2\u0006\u0004\u0008$\u0010&J&\u0010)\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0013H\u0096\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0003\u00a2\u0006\u0004\u0008+\u0010\u0012J\u001e\u0010,\u001a\u00020\u00102\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001\u00a2\u0006\u0004\u0008,\u0010\u001aJ\u0018\u0010-\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0003\u00a2\u0006\u0004\u0008-\u0010\"J\u0018\u0010.\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0010H\u0096\u0001\u00a2\u0006\u0004\u00080\u00101J\u0016\u00103\u001a\u0008\u0012\u0004\u0012\u00028\u000002H\u0096\u0003\u00a2\u0006\u0004\u00083\u00104J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001\u00a2\u0006\u0004\u00085\u0010/J\u0018\u00108\u001a\u00020\u00152\u0006\u00107\u001a\u000206H\u0096\u0001\u00a2\u0006\u0004\u00088\u00109J*\u0010=\u001a\u0004\u0018\u0001062\u0006\u0010:\u001a\u0002062\u0006\u0010;\u001a\u0002062\u0006\u0010<\u001a\u000206H\u0096\u0001\u00a2\u0006\u0004\u0008=\u0010>R \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010?\u001a\u0004\u0008@\u0010AR\u0014\u0010D\u001a\u0002068\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010CR\u000b\u0010E\u001a\u00020\u00138\u0016X\u0096\u0005\u00a8\u0006H"
    }
    d2 = {
        "Landroidx/navigation3/runtime/NavBackStack;",
        "Lvu4;",
        "T",
        "",
        "Ln37;",
        "Ljava/util/RandomAccess;",
        "Lkotlin/collections/RandomAccess;",
        "Lyx6;",
        "base",
        "<init>",
        "(Lyx6;)V",
        "()V",
        "",
        "elements",
        "([Lvu4;)V",
        "element",
        "",
        "add",
        "(Lvu4;)Z",
        "",
        "index",
        "Lvs7;",
        "(ILvu4;)V",
        "remove",
        "",
        "addAll",
        "(Ljava/util/Collection;)Z",
        "(ILjava/util/Collection;)Z",
        "removeAll",
        "retainAll",
        "clear",
        "set",
        "(ILvu4;)Lvu4;",
        "removeAt",
        "(I)Lvu4;",
        "",
        "listIterator",
        "()Ljava/util/ListIterator;",
        "(I)Ljava/util/ListIterator;",
        "fromIndex",
        "toIndex",
        "subList",
        "(II)Ljava/util/List;",
        "contains",
        "containsAll",
        "get",
        "indexOf",
        "(Lvu4;)I",
        "isEmpty",
        "()Z",
        "",
        "iterator",
        "()Ljava/util/Iterator;",
        "lastIndexOf",
        "Lp37;",
        "value",
        "prependStateRecord",
        "(Lp37;)V",
        "previous",
        "current",
        "applied",
        "mergeRecords",
        "(Lp37;Lp37;Lp37;)Lp37;",
        "Lyx6;",
        "getBase$navigation3_runtime",
        "()Lyx6;",
        "getFirstStateRecord",
        "()Lp37;",
        "firstStateRecord",
        "size",
        "Companion",
        "ys4",
        "navigation3-runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
    with = Ldt4;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lys4;


# instance fields
.field private final base:Lyx6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyx6;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lys4;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/navigation3/runtime/NavBackStack;->Companion:Lys4;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>()V
    .locals 1

    .line 24
    new-instance v0, Lyx6;

    invoke-direct {v0}, Lyx6;-><init>()V

    .line 25
    invoke-direct {p0, v0}, Landroidx/navigation3/runtime/NavBackStack;-><init>(Lyx6;)V

    return-void
.end method

.method public constructor <init>(Lyx6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyx6;",
            ")V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    return-void
.end method

.method public varargs constructor <init>([Lvu4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)V"
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    new-instance v0, Lyx6;

    .line 7
    .line 8
    invoke-direct {v0}, Lyx6;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lqs;->p1([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Lyx6;->addAll(Ljava/util/Collection;)Z

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0}, Landroidx/navigation3/runtime/NavBackStack;-><init>(Lyx6;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p2, Lvu4;

    invoke-virtual {p0, p1, p2}, Landroidx/navigation3/runtime/NavBackStack;->add(ILvu4;)V

    return-void
.end method

.method public add(ILvu4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .line 8
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    invoke-virtual {p0, p1, p2}, Lyx6;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    .line 10
    check-cast p1, Lvu4;

    invoke-virtual {p0, p1}, Landroidx/navigation3/runtime/NavBackStack;->add(Lvu4;)Z

    move-result p0

    return p0
.end method

.method public add(Lvu4;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TT;>;)Z"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lyx6;->addAll(ILjava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TT;>;)Z"
        }
    .end annotation

    .line 8
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    invoke-virtual {p0, p1}, Lyx6;->addAll(Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyx6;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lvu4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lvu4;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/navigation3/runtime/NavBackStack;->contains(Lvu4;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public contains(Lvu4;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 14
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    invoke-virtual {p0, p1}, Lyx6;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyx6;->containsAll(Ljava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Landroidx/navigation3/runtime/NavBackStack;->get(I)Lvu4;

    move-result-object p0

    return-object p0
.end method

.method public get(I)Lvu4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyx6;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lvu4;

    .line 8
    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final getBase$navigation3_runtime()Lyx6;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyx6;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getFirstStateRecord()Lp37;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    iget-object p0, p0, Lyx6;->w:Lk37;

    .line 4
    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyx6;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lvu4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lvu4;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/navigation3/runtime/NavBackStack;->indexOf(Lvu4;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public indexOf(Lvu4;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    .line 14
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    invoke-virtual {p0, p1}, Lyx6;->indexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyx6;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyx6;->listIterator()Ljava/util/ListIterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lvu4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lvu4;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/navigation3/runtime/NavBackStack;->lastIndexOf(Lvu4;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public lastIndexOf(Lvu4;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    .line 14
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    invoke-virtual {p0, p1}, Lyx6;->lastIndexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation

    .line 12
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    invoke-virtual {p0}, Lyx6;->listIterator()Ljava/util/ListIterator;

    move-result-object p0

    return-object p0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld03;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Ld03;-><init>(Lyx6;I)V

    .line 9
    .line 10
    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public mergeRecords(Lp37;Lp37;Lp37;)Lp37;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method

.method public prependStateRecord(Lp37;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyx6;->prependStateRecord(Lp37;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 0

    .line 15
    invoke-virtual {p0, p1}, Landroidx/navigation3/runtime/NavBackStack;->remove(I)Lvu4;

    move-result-object p0

    return-object p0
.end method

.method public final bridge remove(I)Lvu4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 14
    invoke-virtual {p0, p1}, Landroidx/navigation3/runtime/NavBackStack;->removeAt(I)Lvu4;

    move-result-object p0

    return-object p0
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lvu4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lvu4;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/navigation3/runtime/NavBackStack;->remove(Lvu4;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public remove(Lvu4;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 16
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyx6;->removeAll(Ljava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public removeAt(I)Lvu4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyx6;->remove(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lvu4;

    .line 8
    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyx6;->retainAll(Ljava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 10
    check-cast p2, Lvu4;

    invoke-virtual {p0, p1, p2}, Landroidx/navigation3/runtime/NavBackStack;->set(ILvu4;)Lvu4;

    move-result-object p0

    return-object p0
.end method

.method public set(ILvu4;)Lvu4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)TT;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lyx6;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lvu4;

    .line 8
    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final bridge size()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/navigation3/runtime/NavBackStack;->getSize()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public subList(II)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/navigation3/runtime/NavBackStack;->base:Lyx6;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lyx6;->subList(II)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lrc9;->W0(Ljava/util/Collection;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .line 6
    invoke-static {p0, p1}, Lrc9;->X0(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
