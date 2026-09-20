.class public abstract Lt34;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lm34;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v5, Lp04;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {v5, v0}, Lp04;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lx32;->w:Lx32;

    .line 8
    .line 9
    invoke-static {v0}, Lgl0;->E(Le81;)Lig0;

    .line 10
    .line 11
    .line 12
    move-result-object v8

    .line 13
    invoke-static {}, Lgl0;->F()Lwp1;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    const/4 v0, 0x0

    .line 18
    const/16 v1, 0xf

    .line 19
    .line 20
    invoke-static {v0, v0, v0, v0, v1}, Lm31;->b(IIIII)J

    .line 21
    .line 22
    .line 23
    move-result-wide v10

    .line 24
    new-instance v0, Lm34;

    .line 25
    .line 26
    const/16 v17, 0x0

    .line 27
    .line 28
    const/16 v18, 0x0

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    sget-object v12, La42;->w:La42;

    .line 37
    .line 38
    const/4 v13, 0x0

    .line 39
    const/4 v14, 0x0

    .line 40
    const/4 v15, 0x0

    .line 41
    sget-object v16, Lz75;->w:Lz75;

    .line 42
    .line 43
    invoke-direct/range {v0 .. v18}, Lm34;-><init>(Ln34;IZFLmh4;FZLo81;Ltp1;JLjava/util/List;IIILz75;II)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lt34;->a:Lm34;

    .line 47
    .line 48
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
.end method

.method public static final a(IILyt2;)Ls34;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p1, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    move p0, v1

    .line 7
    :cond_0
    new-array p1, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v2, Ls34;->y:Lkg5;

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Lyt2;->e(I)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {p2, v1}, Lyt2;->e(I)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    or-int/2addr v3, v4

    .line 20
    invoke-virtual {p2}, Lyt2;->Q()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    sget-object v3, Lay0;->a:Ld63;

    .line 27
    .line 28
    if-ne v4, v3, :cond_2

    .line 29
    .line 30
    :cond_1
    new-instance v4, Lo04;

    .line 31
    .line 32
    invoke-direct {v4, p0, v0}, Lo04;-><init>(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v4}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    check-cast v4, Lsr2;

    .line 39
    .line 40
    invoke-static {p1, v2, v4, p2, v1}, Lu55;->t([Ljava/lang/Object;Llf6;Lsr2;Lyt2;I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ls34;

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
