.class public final Ldr2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/view/Window$OnFrameMetricsAvailableListener;


# instance fields
.field public final synthetic a:Lkb9;


# direct methods
.method public constructor <init>(Lkb9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldr2;->a:Lkb9;

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


# virtual methods
.method public final onFrameMetricsAvailable(Landroid/view/Window;Landroid/view/FrameMetrics;I)V
    .locals 4

    .line 1
    iget-object p0, p0, Ldr2;->a:Lkb9;

    .line 2
    .line 3
    iget p1, p0, Lkb9;->x:I

    .line 4
    .line 5
    and-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lkb9;->y:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, [Landroid/util/SparseIntArray;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    aget-object p0, p0, p1

    .line 15
    .line 16
    const/16 p1, 0x8

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Landroid/view/FrameMetrics;->getMetric(I)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    const-wide/32 v0, 0x7a120

    .line 25
    .line 26
    .line 27
    add-long/2addr v0, p1

    .line 28
    const-wide/32 v2, 0xf4240

    .line 29
    .line 30
    .line 31
    div-long/2addr v0, v2

    .line 32
    long-to-int p3, v0

    .line 33
    const-wide/16 v0, 0x0

    .line 34
    .line 35
    cmp-long p1, p1, v0

    .line 36
    .line 37
    if-ltz p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0, p3}, Landroid/util/SparseIntArray;->get(I)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    add-int/lit8 p1, p1, 0x1

    .line 44
    .line 45
    invoke-virtual {p0, p3, p1}, Landroid/util/SparseIntArray;->put(II)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
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
