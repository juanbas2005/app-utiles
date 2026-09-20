.class public final Lyl1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lg53;
.implements Lo81;


# instance fields
.field public final A:Lio/ktor/util/date/GMTDate;

.field public final B:Le81;

.field public final C:Ll43;

.field public final D:Ljava/lang/Object;

.field public final E:Lcz2;

.field public final synthetic w:I

.field public final x:Lw63;

.field public final y:Lr53;

.field public final z:Lio/ktor/util/date/GMTDate;


# direct methods
.method public constructor <init>(Ll43;Li63;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyl1;->w:I

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lyl1;->C:Ll43;

    .line 57
    iget-object p1, p2, Li63;->f:Le81;

    .line 58
    iput-object p1, p0, Lyl1;->B:Le81;

    .line 59
    iget-object p1, p2, Li63;->a:Lw63;

    .line 60
    iput-object p1, p0, Lyl1;->x:Lw63;

    .line 61
    iget-object p1, p2, Li63;->d:Lr53;

    .line 62
    iput-object p1, p0, Lyl1;->y:Lr53;

    .line 63
    iget-object p1, p2, Li63;->b:Lio/ktor/util/date/GMTDate;

    .line 64
    iput-object p1, p0, Lyl1;->z:Lio/ktor/util/date/GMTDate;

    .line 65
    iget-object p1, p2, Li63;->g:Lio/ktor/util/date/GMTDate;

    .line 66
    iput-object p1, p0, Lyl1;->A:Lio/ktor/util/date/GMTDate;

    .line 67
    iget-object p1, p2, Li63;->e:Ljava/lang/Object;

    .line 68
    instance-of v0, p1, Lhf0;

    if-eqz v0, :cond_0

    check-cast p1, Lhf0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 69
    sget-object p1, Lhf0;->a:Lgf0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    sget-object p1, Lgf0;->b:Lff0;

    .line 71
    :cond_1
    iput-object p1, p0, Lyl1;->D:Ljava/lang/Object;

    .line 72
    iget-object p1, p2, Li63;->c:Li45;

    .line 73
    iput-object p1, p0, Lyl1;->E:Lcz2;

    return-void
.end method

.method public constructor <init>(Lwe6;[BLyl1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyl1;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyl1;->C:Ll43;

    .line 8
    .line 9
    iput-object p2, p0, Lyl1;->D:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p3}, Lyl1;->e()Lw63;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lyl1;->x:Lw63;

    .line 16
    .line 17
    iget p1, p3, Lyl1;->w:I

    .line 18
    .line 19
    packed-switch p1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget-object p1, p3, Lyl1;->y:Lr53;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_0
    iget-object p1, p3, Lyl1;->y:Lr53;

    .line 26
    .line 27
    :goto_0
    iput-object p1, p0, Lyl1;->y:Lr53;

    .line 28
    .line 29
    invoke-virtual {p3}, Lyl1;->c()Lio/ktor/util/date/GMTDate;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lyl1;->z:Lio/ktor/util/date/GMTDate;

    .line 34
    .line 35
    invoke-virtual {p3}, Lyl1;->d()Lio/ktor/util/date/GMTDate;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lyl1;->A:Lio/ktor/util/date/GMTDate;

    .line 40
    .line 41
    invoke-interface {p3}, Lg53;->a()Lcz2;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lyl1;->E:Lcz2;

    .line 46
    .line 47
    invoke-interface {p3}, Lo81;->k()Le81;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lyl1;->B:Le81;

    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public final V()Ll43;
    .locals 1

    .line 1
    iget v0, p0, Lyl1;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Lyl1;->C:Ll43;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lwe6;

    .line 9
    .line 10
    :pswitch_0
    return-object p0

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final a()Lcz2;
    .locals 1

    .line 1
    iget v0, p0, Lyl1;->w:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyl1;->E:Lcz2;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lyl1;->E:Lcz2;

    .line 10
    .line 11
    check-cast p0, Li45;

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final b()Lhf0;
    .locals 1

    .line 1
    iget v0, p0, Lyl1;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Lyl1;->D:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, [B

    .line 9
    .line 10
    invoke-static {p0}, Lh49;->c([B)Lqy6;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p0, Lhf0;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 20
    .line 21
.end method

.method public final c()Lio/ktor/util/date/GMTDate;
    .locals 1

    .line 1
    iget v0, p0, Lyl1;->w:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyl1;->z:Lio/ktor/util/date/GMTDate;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lyl1;->z:Lio/ktor/util/date/GMTDate;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final d()Lio/ktor/util/date/GMTDate;
    .locals 1

    .line 1
    iget v0, p0, Lyl1;->w:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyl1;->A:Lio/ktor/util/date/GMTDate;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lyl1;->A:Lio/ktor/util/date/GMTDate;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final e()Lw63;
    .locals 1

    .line 1
    iget v0, p0, Lyl1;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Lyl1;->x:Lw63;

    .line 4
    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
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

.method public final k()Le81;
    .locals 1

    .line 1
    iget v0, p0, Lyl1;->w:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyl1;->B:Le81;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lyl1;->B:Le81;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HttpResponse["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lyl1;->V()Ll43;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ll43;->c()Lx53;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Lx53;->D()Lio/ktor/http/Url;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lyl1;->e()Lw63;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/16 p0, 0x5d

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
    .line 45
    .line 46
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
.end method
