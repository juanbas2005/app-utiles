.class public final synthetic Lfq8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic w:Lbs8;

.field public final synthetic x:Lyx6;


# direct methods
.method public synthetic constructor <init>(Lbs8;Lyx6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfq8;->w:Lbs8;

    .line 5
    .line 6
    iput-object p2, p0, Lfq8;->x:Lyx6;

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


# virtual methods
.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p3, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    check-cast p2, Lyt2;

    .line 8
    .line 9
    check-cast p1, Lbw8;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    and-int/lit8 v0, p3, 0x6

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eq v1, v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x4

    .line 28
    :goto_0
    or-int/2addr p3, v0

    .line 29
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 30
    .line 31
    const/16 v2, 0x12

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-eq v0, v2, :cond_2

    .line 35
    .line 36
    move v0, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v0, v3

    .line 39
    :goto_1
    and-int/2addr p3, v1

    .line 40
    invoke-virtual {p2, p3, v0}, Lyt2;->V(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_4

    .line 45
    .line 46
    iget p1, p1, Lbw8;->a:I

    .line 47
    .line 48
    invoke-virtual {p2}, Lyt2;->Q()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    sget-object v0, Lay0;->a:Ld63;

    .line 53
    .line 54
    if-ne p3, v0, :cond_3

    .line 55
    .line 56
    new-instance p3, Lpq8;

    .line 57
    .line 58
    iget-object v0, p0, Lfq8;->x:Lyx6;

    .line 59
    .line 60
    invoke-direct {p3, v0, v3}, Lpq8;-><init>(Lyx6;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, p3}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    check-cast p3, Lsr2;

    .line 67
    .line 68
    const/16 v0, 0x180

    .line 69
    .line 70
    iget-object p0, p0, Lfq8;->w:Lbs8;

    .line 71
    .line 72
    invoke-static {p1, p0, p3, p2, v0}, Li35;->r(ILbs8;Lsr2;Lyt2;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-virtual {p2}, Lyt2;->Y()V

    .line 77
    .line 78
    .line 79
    :goto_2
    sget-object p0, Lvs7;->a:Lvs7;

    .line 80
    .line 81
    return-object p0
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
