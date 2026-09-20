.class public final Lyj;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyj;->x:I

    .line 2
    .line 3
    iput-object p2, p0, Lyj;->y:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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
    .locals 3

    .line 1
    iget v0, p0, Lyj;->x:I

    .line 2
    .line 3
    iget-object p0, p0, Lyj;->y:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lcv6;

    .line 9
    .line 10
    iget-object p1, p1, Lcv6;->a:Lyt2;

    .line 11
    .line 12
    check-cast p2, Lyt2;

    .line 13
    .line 14
    check-cast p3, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    iget-wide v0, p2, Lyt2;->T:J

    .line 20
    .line 21
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    check-cast p0, Lml4;

    .line 26
    .line 27
    invoke-static {p2, p0}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const p2, 0x1e65194f

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lyt2;->f0(I)V

    .line 35
    .line 36
    .line 37
    sget-object p2, Lux0;->d:Ltx0;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget-object p2, Ltx0;->d:Lck;

    .line 43
    .line 44
    invoke-static {p2, p1, p0}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    sget-object p2, Ltx0;->g:Lck;

    .line 52
    .line 53
    invoke-static {p2, p1, p0}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    invoke-virtual {p1, p0}, Lyt2;->r(Z)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lvs7;->a:Lvs7;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_0
    check-cast p1, Loh4;

    .line 64
    .line 65
    check-cast p2, Lgh4;

    .line 66
    .line 67
    check-cast p3, Lk31;

    .line 68
    .line 69
    iget-wide v0, p3, Lk31;->a:J

    .line 70
    .line 71
    invoke-interface {p2, v0, v1}, Lgh4;->y(J)Leh5;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    iget p3, p2, Leh5;->w:I

    .line 76
    .line 77
    iget v0, p2, Leh5;->x:I

    .line 78
    .line 79
    new-instance v1, Llh;

    .line 80
    .line 81
    check-cast p0, Lk51;

    .line 82
    .line 83
    const/4 v2, 0x5

    .line 84
    invoke-direct {v1, v2, p2, p0}, Llh;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lb42;->w:Lb42;

    .line 88
    .line 89
    invoke-interface {p1, p3, v0, p0, v1}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
