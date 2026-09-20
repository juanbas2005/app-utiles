.class public final Lgd7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/graphics/drawable/Drawable;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgd7;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lgd7;->x:Landroid/graphics/drawable/Drawable;

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
    .locals 8

    .line 1
    iget v0, p0, Lgd7;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/16 v2, 0x30

    .line 6
    .line 7
    iget-object p0, p0, Lgd7;->x:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/16 v4, 0x10

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Ljt0;

    .line 17
    .line 18
    iget-wide v6, p1, Ljt0;->a:J

    .line 19
    .line 20
    check-cast p2, Lyt2;

    .line 21
    .line 22
    check-cast p3, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-int/lit8 p3, p1, 0x11

    .line 29
    .line 30
    if-eq p3, v4, :cond_0

    .line 31
    .line 32
    move v3, v5

    .line 33
    :cond_0
    and-int/2addr p1, v5

    .line 34
    invoke-virtual {p2, p1, v3}, Lyt2;->V(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    sget-object p1, Lxb4;->b0:Lxb4;

    .line 41
    .line 42
    invoke-virtual {p1, p0, p2, v2}, Lxb4;->a(Landroid/graphics/drawable/Drawable;Lyt2;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p2}, Lyt2;->Y()V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-object v1

    .line 50
    :pswitch_0
    check-cast p1, Ljt0;

    .line 51
    .line 52
    iget-wide v6, p1, Ljt0;->a:J

    .line 53
    .line 54
    check-cast p2, Lyt2;

    .line 55
    .line 56
    check-cast p3, Ljava/lang/Number;

    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    and-int/lit8 p3, p1, 0x11

    .line 63
    .line 64
    if-eq p3, v4, :cond_2

    .line 65
    .line 66
    move v3, v5

    .line 67
    :cond_2
    and-int/2addr p1, v5

    .line 68
    invoke-virtual {p2, p1, v3}, Lyt2;->V(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    sget-object p1, Lxb4;->b0:Lxb4;

    .line 75
    .line 76
    invoke-virtual {p1, p0, p2, v2}, Lxb4;->a(Landroid/graphics/drawable/Drawable;Lyt2;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {p2}, Lyt2;->Y()V

    .line 81
    .line 82
    .line 83
    :goto_1
    return-object v1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
