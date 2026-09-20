.class public final Lyn1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyn1;->w:I

    .line 2
    .line 3
    iput-object p2, p0, Lyn1;->x:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
    .locals 5

    .line 1
    iget v0, p0, Lyn1;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Lyn1;->x:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Void;

    .line 12
    .line 13
    check-cast p2, Lyt2;

    .line 14
    .line 15
    check-cast p3, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    check-cast p0, Lfw0;

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p2, p1}, Lfw0;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    check-cast p1, Ljt0;

    .line 31
    .line 32
    iget-wide v3, p1, Ljt0;->a:J

    .line 33
    .line 34
    check-cast p2, Lyt2;

    .line 35
    .line 36
    check-cast p3, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    and-int/lit8 p3, p1, 0x6

    .line 43
    .line 44
    if-nez p3, :cond_1

    .line 45
    .line 46
    invoke-virtual {p2, v3, v4}, Lyt2;->f(J)Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    if-eqz p3, :cond_0

    .line 51
    .line 52
    const/4 p3, 0x4

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 p3, 0x2

    .line 55
    :goto_0
    or-int/2addr p1, p3

    .line 56
    :cond_1
    and-int/lit8 p3, p1, 0x13

    .line 57
    .line 58
    const/16 v0, 0x12

    .line 59
    .line 60
    if-eq p3, v0, :cond_2

    .line 61
    .line 62
    const/4 v2, 0x1

    .line 63
    :cond_2
    and-int/lit8 p3, p1, 0x1

    .line 64
    .line 65
    invoke-virtual {p2, p3, v2}, Lyt2;->V(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    if-eqz p3, :cond_3

    .line 70
    .line 71
    check-cast p0, Lhd7;

    .line 72
    .line 73
    iget p0, p0, Lhd7;->c:I

    .line 74
    .line 75
    shl-int/lit8 p1, p1, 0x3

    .line 76
    .line 77
    and-int/lit8 p1, p1, 0x70

    .line 78
    .line 79
    invoke-static {p0, v3, v4, p2, p1}, Lzn1;->b(IJLyt2;I)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-virtual {p2}, Lyt2;->Y()V

    .line 84
    .line 85
    .line 86
    :goto_1
    return-object v1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method
