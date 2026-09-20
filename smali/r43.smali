.class public final synthetic Lr43;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ls43;


# direct methods
.method public synthetic constructor <init>(Ls43;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr43;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lr43;->x:Ls43;

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
    .locals 4

    .line 1
    iget v0, p0, Lr43;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Lr43;->x:Ls43;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lw77;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lfl3;-><init>(Lel3;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Ld63;->z:Ld63;

    .line 15
    .line 16
    new-instance v2, Lv81;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v2, v1, v3}, Lv81;-><init>(Ld81;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v2}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object p0, p0, Ls43;->w:Lz97;

    .line 27
    .line 28
    invoke-virtual {p0}, Lz97;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lh81;

    .line 33
    .line 34
    invoke-interface {v0, p0}, Le81;->X(Le81;)Le81;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    new-instance v0, Lk81;

    .line 39
    .line 40
    const-string v1, "ktor-okhttp-context"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Lk81;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p0, v0}, Le81;->X(Le81;)Le81;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :pswitch_0
    check-cast p0, Lh45;

    .line 51
    .line 52
    iget-object p0, p0, Lh45;->A:Le45;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object p0, Law1;->a:Ldn1;

    .line 58
    .line 59
    sget-object p0, Lcm1;->y:Lcm1;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
