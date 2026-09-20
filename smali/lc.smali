.class public final synthetic Llc;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ltp1;


# direct methods
.method public synthetic constructor <init>(Ltp1;I)V
    .locals 0

    .line 1
    iput p2, p0, Llc;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Llc;->x:Ltp1;

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
.method public final b()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Llc;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Llc;->x:Ltp1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lww4;->a:F

    .line 9
    .line 10
    invoke-interface {p0, v0}, Ltp1;->r0(F)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/high16 v1, 0x42600000    # 56.0f

    .line 15
    .line 16
    invoke-interface {p0, v1}, Ltp1;->r0(F)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    sub-int/2addr v0, p0

    .line 21
    int-to-float p0, v0

    .line 22
    const/high16 v0, 0x40000000    # 2.0f

    .line 23
    .line 24
    div-float/2addr p0, v0

    .line 25
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    int-to-long v0, p0

    .line 30
    const/4 p0, 0x0

    .line 31
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    int-to-long v2, p0

    .line 36
    const/16 p0, 0x20

    .line 37
    .line 38
    shl-long/2addr v0, p0

    .line 39
    const-wide v4, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v2, v4

    .line 45
    or-long/2addr v0, v2

    .line 46
    new-instance p0, Ll35;

    .line 47
    .line 48
    invoke-direct {p0, v0, v1}, Ll35;-><init>(J)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    const/high16 v0, 0x42fa0000    # 125.0f

    .line 53
    .line 54
    invoke-interface {p0, v0}, Ltp1;->e0(F)F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
