.class public abstract Lq04;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Ld04;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v5, Lp04;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v5, v0}, Lp04;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lgl0;->F()Lwp1;

    .line 8
    .line 9
    .line 10
    move-result-object v9

    .line 11
    sget-object v0, Lx32;->w:Lx32;

    .line 12
    .line 13
    invoke-static {v0}, Lgl0;->E(Le81;)Lig0;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    new-instance v0, Ld04;

    .line 18
    .line 19
    new-instance v11, Ltm3;

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    invoke-direct {v11, v1}, Ltm3;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v12, Ltm3;

    .line 26
    .line 27
    const/4 v1, 0x5

    .line 28
    invoke-direct {v12, v1}, Ltm3;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/16 v18, 0x0

    .line 32
    .line 33
    const/16 v19, 0x0

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v10, 0x0

    .line 42
    sget-object v13, La42;->w:La42;

    .line 43
    .line 44
    const/4 v14, 0x0

    .line 45
    const/4 v15, 0x0

    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    sget-object v17, Lz75;->w:Lz75;

    .line 49
    .line 50
    invoke-direct/range {v0 .. v19}, Ld04;-><init>(Lf04;IZFLmh4;FZLo81;Ltp1;ILvr2;Lvr2;Ljava/util/List;IIILz75;II)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lq04;->a:Ld04;

    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public static final a(IILyt2;)Ln04;
    .locals 4

    .line 1
    and-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    move p0, v0

    .line 7
    :cond_0
    new-array p1, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v1, Ln04;->w:Lkg5;

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Lyt2;->e(I)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p2, v0}, Lyt2;->e(I)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    or-int/2addr v2, v3

    .line 20
    invoke-virtual {p2}, Lyt2;->Q()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    sget-object v2, Lay0;->a:Ld63;

    .line 27
    .line 28
    if-ne v3, v2, :cond_2

    .line 29
    .line 30
    :cond_1
    new-instance v3, Lo04;

    .line 31
    .line 32
    invoke-direct {v3, p0, v0}, Lo04;-><init>(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v3}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    check-cast v3, Lsr2;

    .line 39
    .line 40
    invoke-static {p1, v1, v3, p2, v0}, Lu55;->t([Ljava/lang/Object;Llf6;Lsr2;Lyt2;I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ln04;

    .line 45
    .line 46
    return-object p0
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
