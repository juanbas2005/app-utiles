.class public final Lui;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljd7;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lvr2;

.field public final c:Lsr2;

.field public final d:Lmq4;

.field public final e:Lcy6;

.field public final f:Loi;

.field public final g:Loi;

.field public h:Landroid/view/ActionMode;

.field public i:Lti;

.field public j:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/view/View;Lvr2;Lsr2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lui;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lui;->b:Lvr2;

    .line 7
    .line 8
    iput-object p3, p0, Lui;->c:Lsr2;

    .line 9
    .line 10
    new-instance p1, Lmq4;

    .line 11
    .line 12
    invoke-direct {p1}, Lmq4;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lui;->d:Lmq4;

    .line 16
    .line 17
    new-instance p1, Lcy6;

    .line 18
    .line 19
    new-instance p2, Loi;

    .line 20
    .line 21
    const/4 p3, 0x0

    .line 22
    invoke-direct {p2, p0, p3}, Loi;-><init>(Lui;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, p2}, Lcy6;-><init>(Lvr2;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lui;->e:Lcy6;

    .line 29
    .line 30
    new-instance p1, Loi;

    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-direct {p1, p0, p2}, Loi;-><init>(Lui;I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lui;->f:Loi;

    .line 37
    .line 38
    new-instance p1, Loi;

    .line 39
    .line 40
    const/4 p2, 0x2

    .line 41
    invoke-direct {p1, p0, p2}, Loi;-><init>(Lui;I)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lui;->g:Loi;

    .line 45
    .line 46
    return-void
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


# virtual methods
.method public final a(Lzc7;La97;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lxc;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, p1, v2, v1}, Lxc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lui;->d:Lmq4;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p1, Lp6;

    .line 14
    .line 15
    sget-object v1, Lhq4;->w:Lhq4;

    .line 16
    .line 17
    invoke-direct {p1, v1, p0, v0, v2}, Lp6;-><init>(Lhq4;Lmq4;Lvr2;Lf61;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Lgl0;->L(Lgs2;Lf61;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sget-object p1, Lp81;->w:Lp81;

    .line 25
    .line 26
    if-ne p0, p1, :cond_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    sget-object p0, Lvs7;->a:Lvs7;

    .line 30
    .line 31
    return-object p0
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
