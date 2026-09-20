.class public final Lik4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ldb2;


# instance fields
.field public final synthetic a:I

.field public final b:Lmu5;

.field public final c:Lmu5;


# direct methods
.method public synthetic constructor <init>(Lmu5;Lmu5;I)V
    .locals 0

    .line 1
    iput p3, p0, Lik4;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lik4;->b:Lmu5;

    .line 4
    .line 5
    iput-object p2, p0, Lik4;->c:Lmu5;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
.method public final get()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lik4;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lik4;->b:Lmu5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v3, Ljv2;

    .line 9
    .line 10
    const/16 v0, 0xe

    .line 11
    .line 12
    invoke-direct {v3, v0}, Ljv2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v4, Ln63;

    .line 16
    .line 17
    const/16 v0, 0xd

    .line 18
    .line 19
    invoke-direct {v4, v0}, Ln63;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v1}, Lmu5;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v2, Lza6;

    .line 27
    .line 28
    move-object v6, v0

    .line 29
    check-cast v6, Lrg6;

    .line 30
    .line 31
    sget-object v5, Lq00;->f:Lq00;

    .line 32
    .line 33
    iget-object v7, p0, Lik4;->c:Lmu5;

    .line 34
    .line 35
    invoke-direct/range {v2 .. v7}, Lza6;-><init>(Les0;Les0;Lq00;Lrg6;Lmu5;)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :pswitch_0
    check-cast v1, Lfb1;

    .line 40
    .line 41
    iget-object v0, v1, Lfb1;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Landroid/content/Context;

    .line 44
    .line 45
    iget-object p0, p0, Lik4;->c:Lmu5;

    .line 46
    .line 47
    check-cast p0, Lfb1;

    .line 48
    .line 49
    invoke-virtual {p0}, Lfb1;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance v1, Lhk4;

    .line 54
    .line 55
    check-cast p0, Lwr0;

    .line 56
    .line 57
    invoke-direct {v1, v0, p0}, Lhk4;-><init>(Landroid/content/Context;Lwr0;)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 62
    .line 63
.end method
