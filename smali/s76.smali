.class public final Ls76;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Lt76;


# direct methods
.method public synthetic constructor <init>(Lt76;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls76;->x:I

    .line 2
    .line 3
    iput-object p1, p0, Ls76;->y:Lt76;

    .line 4
    .line 5
    const/4 p1, 0x1

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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Ls76;->x:I

    .line 2
    .line 3
    iget-object p0, p0, Ls76;->y:Lt76;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object p1, p0, Lt76;->k:Lex1;

    .line 15
    .line 16
    invoke-interface {p1, v0, v1}, Lex1;->b(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    iget p1, p0, Lt76;->e:F

    .line 21
    .line 22
    float-to-double v4, p1

    .line 23
    iget p0, p0, Lt76;->f:F

    .line 24
    .line 25
    float-to-double v6, p0

    .line 26
    invoke-static/range {v2 .. v7}, Lz65;->n(DDD)D

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    iget-object p1, p0, Lt76;->n:Lex1;

    .line 42
    .line 43
    iget v2, p0, Lt76;->e:F

    .line 44
    .line 45
    float-to-double v2, v2

    .line 46
    iget p0, p0, Lt76;->f:F

    .line 47
    .line 48
    float-to-double v4, p0

    .line 49
    invoke-static/range {v0 .. v5}, Lz65;->n(DDD)D

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    invoke-interface {p1, v0, v1}, Lex1;->b(D)D

    .line 54
    .line 55
    .line 56
    move-result-wide p0

    .line 57
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
