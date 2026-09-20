.class public final Le18;
.super Ljava/lang/Object;

# interfaces
.implements Lvr2;


# static fields
.field public static final x:Le18;

.field public static final y:Le18;

.field public static final z:Le18;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le18;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le18;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le18;->x:Le18;

    .line 8
    .line 9
    new-instance v0, Le18;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Le18;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Le18;->y:Le18;

    .line 16
    .line 17
    new-instance v0, Le18;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Le18;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Le18;->z:Le18;

    .line 24
    .line 25
    return-void
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
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Le18;->w:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 7
    iput p1, p0, Le18;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Le18;->w:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lup2;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    sget-object p0, Lm27;->y:Lup2;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Lup2;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    xor-int/2addr p0, v1

    .line 19
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p0, "Argument for @NotNull parameter \'name\' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null"

    .line 25
    .line 26
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-object v0

    .line 30
    :pswitch_0
    check-cast p1, Ltt6;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const-string p0, "Spliterator"

    .line 36
    .line 37
    const-string v0, "java/util/"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object v0, Lzm5;->b:Lzj3;

    .line 44
    .line 45
    filled-new-array {v0, v0}, [Lzj3;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1, p0, v0}, Ltt6;->c(Ljava/lang/String;[Lzj3;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lvs7;->a:Lvs7;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_1
    check-cast p1, Lri0;

    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_2
    check-cast p1, Lri0;

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_3
    check-cast p1, Lgb4;

    .line 62
    .line 63
    iget-object p0, p1, Lgb4;->b:Lsr2;

    .line 64
    .line 65
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :pswitch_4
    check-cast p1, Lri0;

    .line 71
    .line 72
    invoke-interface {p1}, Lri0;->u()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-ne p0, v1, :cond_1

    .line 77
    .line 78
    invoke-interface {p1}, Lvj1;->r()Lvj1;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    check-cast p0, Lql4;

    .line 86
    .line 87
    sget-object p1, Ltj3;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {p0}, Lrs1;->f(Lvj1;)Lvp2;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    sget-object p1, Ltj3;->j:Ljava/util/HashMap;

    .line 94
    .line 95
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    const/4 v1, 0x0

    .line 103
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, Lgq0;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object p0, Lsy6;->j:Lor2;

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_6
    check-cast p1, Lax3;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :pswitch_9
    check-cast p1, Las3;

    .line 133
    .line 134
    sget-object p0, Lg18;->a:Lup2;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {p1}, Lg18;->s(Las3;)Las3;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method
