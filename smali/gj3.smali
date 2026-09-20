.class public final Lgj3;
.super Ljava/lang/Object;

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final x:Lkj3;


# direct methods
.method public synthetic constructor <init>(Lkj3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgj3;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lgj3;->x:Lkj3;

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
    .locals 7

    .line 1
    iget v0, p0, Lgj3;->w:I

    .line 2
    .line 3
    sget-object v1, La42;->w:La42;

    .line 4
    .line 5
    iget-object p0, p0, Lgj3;->x:Lkj3;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljj3;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Ljj3;-><init>(Lkj3;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    invoke-virtual {p0}, Lkj3;->Q()Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    const/16 v6, 0x1e

    .line 29
    .line 30
    sget-object v1, Lb42;->w:Lb42;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-static/range {v0 .. v6}, Lar7;->Y(Ljava/lang/reflect/Type;Ljava/util/Map;Lpp7;ZZLgq7;I)Las3;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    invoke-static {p0}, Lr16;->Z(Lp16;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-static {p0}, Lrg3;->d(Lkj3;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p0}, Lkj3;->a()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_0
    return-object v1

    .line 55
    :pswitch_2
    invoke-static {p0}, Lrg3;->d(Lkj3;)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 60
    .line 61
    .line 62
    .line 63
.end method
