.class public final synthetic Lx78;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Le88;


# direct methods
.method public synthetic constructor <init>(Le88;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx78;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lx78;->x:Le88;

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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lx78;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lq8;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget p1, p1, Lq8;->w:I

    .line 14
    .line 15
    const/4 v0, -0x1

    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lx78;->x:Le88;

    .line 19
    .line 20
    invoke-virtual {p0}, Le88;->e()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-object v1

    .line 24
    :pswitch_0
    move-object v6, p1

    .line 25
    check-cast v6, Landroid/net/Uri;

    .line 26
    .line 27
    if-eqz v6, :cond_1

    .line 28
    .line 29
    iget-object v5, p0, Lx78;->x:Le88;

    .line 30
    .line 31
    iget-object v3, v5, Le88;->c:Ld37;

    .line 32
    .line 33
    invoke-virtual {v3}, Ld37;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lis7;

    .line 38
    .line 39
    iget-boolean p0, p0, Lis7;->b:Z

    .line 40
    .line 41
    if-nez p0, :cond_1

    .line 42
    .line 43
    invoke-static {v5}, Lu58;->a(Lr58;)Lls0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    new-instance v2, Lng;

    .line 48
    .line 49
    const/16 v7, 0x19

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct/range {v2 .. v7}, Lng;-><init>(Ld37;Lf61;Lr58;Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x3

    .line 56
    invoke-static {p0, v4, v4, v2, p1}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 57
    .line 58
    .line 59
    :cond_1
    return-object v1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
