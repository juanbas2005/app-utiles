.class public abstract Lee4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:I

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0xe6

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sput v0, Lee4;->a:I

    .line 10
    .line 11
    const/16 v0, 0x80

    .line 12
    .line 13
    const/16 v1, 0x1b

    .line 14
    .line 15
    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sput v0, Lee4;->b:I

    .line 20
    .line 21
    return-void
.end method

.method public static final a(Lsr2;Lyt2;I)V
    .locals 13

    .line 1
    move v12, p2

    .line 2
    const v0, -0x3ba969ba

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lyt2;->g0(I)Lyt2;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x2

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    or-int/2addr v0, v12

    .line 19
    and-int/lit8 v2, v0, 0x3

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x1

    .line 23
    if-eq v2, v1, :cond_1

    .line 24
    .line 25
    move v1, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v1, v3

    .line 28
    :goto_1
    and-int/2addr v0, v4

    .line 29
    invoke-virtual {p1, v0, v1}, Lyt2;->V(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    sget-object v0, Lyu6;->c:Lsd2;

    .line 36
    .line 37
    new-instance v1, Lce4;

    .line 38
    .line 39
    invoke-direct {v1, v3, p0}, Lce4;-><init>(ILsr2;)V

    .line 40
    .line 41
    .line 42
    const v2, -0x875559f

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v1, p1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    const v10, 0xc00006

    .line 50
    .line 51
    .line 52
    const/16 v11, 0x7e

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    const-wide/16 v2, 0x0

    .line 56
    .line 57
    const-wide/16 v4, 0x0

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    move-object v9, p1

    .line 62
    invoke-static/range {v0 .. v11}, Ls87;->a(Lml4;Lpq6;JJFFLfw0;Lyt2;II)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 67
    .line 68
    .line 69
    :goto_2
    invoke-virtual {p1}, Lyt2;->v()Lyx5;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    new-instance v1, Lce4;

    .line 76
    .line 77
    const/16 v2, 0x10

    .line 78
    .line 79
    invoke-direct {v1, p2, v2, p0}, Lce4;-><init>(IILsr2;)V

    .line 80
    .line 81
    .line 82
    iput-object v1, v0, Lyx5;->d:Lgs2;

    .line 83
    .line 84
    :cond_3
    return-void
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
