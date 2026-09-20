.class public final synthetic Lfv4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbd5;


# direct methods
.method public synthetic constructor <init>(Lbd5;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfv4;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lfv4;->x:Lbd5;

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
    .locals 5

    .line 1
    iget v0, p0, Lfv4;->w:I

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    iget-object p0, p0, Lfv4;->x:Lbd5;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0, p1}, Lbd5;->e(I)V

    .line 19
    .line 20
    .line 21
    return-object v2

    .line 22
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p0, p1}, Lbd5;->e(I)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {p0, p1}, Lbd5;->e(I)V

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :pswitch_2
    check-cast p1, Lwe3;

    .line 43
    .line 44
    iget-wide v3, p1, Lwe3;->a:J

    .line 45
    .line 46
    shr-long v0, v3, v1

    .line 47
    .line 48
    long-to-int p1, v0

    .line 49
    invoke-virtual {p0, p1}, Lbd5;->e(I)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :pswitch_3
    check-cast p1, Lwe3;

    .line 54
    .line 55
    iget-wide v3, p1, Lwe3;->a:J

    .line 56
    .line 57
    shr-long v0, v3, v1

    .line 58
    .line 59
    long-to-int p1, v0

    .line 60
    invoke-virtual {p0, p1}, Lbd5;->e(I)V

    .line 61
    .line 62
    .line 63
    return-object v2

    .line 64
    :pswitch_4
    check-cast p1, Lwe3;

    .line 65
    .line 66
    iget-wide v3, p1, Lwe3;->a:J

    .line 67
    .line 68
    shr-long v0, v3, v1

    .line 69
    .line 70
    long-to-int p1, v0

    .line 71
    invoke-virtual {p0, p1}, Lbd5;->e(I)V

    .line 72
    .line 73
    .line 74
    return-object v2

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 76
.end method
