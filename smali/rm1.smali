.class public final Lrm1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lrm1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lrm1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lrm1;->a:Lrm1;

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


# virtual methods
.method public final a(Lgx4;Lyt2;I)V
    .locals 13

    .line 1
    move-object v9, p2

    .line 2
    move/from16 v12, p3

    .line 3
    .line 4
    const v0, -0x34581686    # -2.2008564E7f

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, v0}, Lyt2;->g0(I)Lyt2;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p1}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    or-int/2addr v0, v12

    .line 21
    and-int/lit8 v2, v0, 0x3

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x1

    .line 25
    if-eq v2, v1, :cond_1

    .line 26
    .line 27
    move v1, v4

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, v3

    .line 30
    :goto_1
    and-int/2addr v0, v4

    .line 31
    invoke-virtual {p2, v0, v1}, Lyt2;->V(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p1, Lgx4;->b:Lml4;

    .line 38
    .line 39
    iget-wide v1, p1, Lgx4;->e:J

    .line 40
    .line 41
    iget-wide v4, p1, Lgx4;->f:J

    .line 42
    .line 43
    new-instance v6, Lqm1;

    .line 44
    .line 45
    invoke-direct {v6, p1, v3}, Lqm1;-><init>(Lgx4;I)V

    .line 46
    .line 47
    .line 48
    const v3, -0x6348c22b

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v6, p2}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    const/high16 v10, 0xc00000

    .line 56
    .line 57
    const/16 v11, 0x72

    .line 58
    .line 59
    move-wide v2, v1

    .line 60
    const/4 v1, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    invoke-static/range {v0 .. v11}, Ls87;->a(Lml4;Lpq6;JJFFLfw0;Lyt2;II)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {p2}, Lyt2;->Y()V

    .line 68
    .line 69
    .line 70
    :goto_2
    invoke-virtual {p2}, Lyt2;->v()Lyx5;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    new-instance v1, Lp13;

    .line 77
    .line 78
    const/16 v2, 0xb

    .line 79
    .line 80
    invoke-direct {v1, p0, p1, v12, v2}, Lp13;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 81
    .line 82
    .line 83
    iput-object v1, v0, Lyx5;->d:Lgs2;

    .line 84
    .line 85
    :cond_3
    return-void
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
