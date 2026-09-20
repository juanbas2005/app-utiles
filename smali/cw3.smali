.class public final Lcw3;
.super Ljava/lang/Object;

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final x:Ldw3;

.field public final y:Lyq3;


# direct methods
.method public constructor <init>(Ldw3;Lyq3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcw3;->w:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcw3;->x:Ldw3;

    iput-object p2, p0, Lcw3;->y:Lyq3;

    return-void
.end method

.method public constructor <init>(Lyq3;Ldw3;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcw3;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcw3;->y:Lyq3;

    .line 8
    .line 9
    iput-object p2, p0, Lcw3;->x:Ldw3;

    .line 10
    .line 11
    return-void
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
    .locals 5

    .line 1
    iget v0, p0, Lcw3;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcw3;->y:Lyq3;

    .line 5
    .line 6
    iget-object p0, p0, Lcw3;->x:Ldw3;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldw3;->D:Lqu3;

    .line 12
    .line 13
    iget-object v0, v0, Lqu3;->h:Luu3;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {v2}, Lvp0;->b()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lm06;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p0}, Ldw3;->U()Lvp7;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v3, Lxo3;

    .line 30
    .line 31
    const/4 v4, 0x5

    .line 32
    invoke-direct {v3, v4, p0}, Lxo3;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x4

    .line 36
    invoke-static {v0, v1, v2, v3, p0}, Lpd8;->M(Luu3;Ljava/lang/ClassLoader;Lvp7;Lsr2;I)Lc2;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_0
    const-string p0, "returnType"

    .line 42
    .line 43
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v1

    .line 47
    :pswitch_0
    instance-of v0, v2, Loq3;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    move-object v0, v2

    .line 52
    check-cast v0, Loq3;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v0, v1

    .line 56
    :goto_0
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-object v0, v0, Loq3;->y:Lnz3;

    .line 59
    .line 60
    invoke-interface {v0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lkq3;

    .line 65
    .line 66
    invoke-virtual {v0}, Lkq3;->d()Lvp7;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_2
    sget-object v0, Lvp7;->d:Lvp7;

    .line 71
    .line 72
    iget-object v0, p0, Ldw3;->D:Lqu3;

    .line 73
    .line 74
    iget-object v0, v0, Lqu3;->c:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-interface {v2}, Lvp0;->b()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v2}, Lm06;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v0, v1, p0, v2}, Laa5;->f(Ljava/util/List;Lvp7;Les3;Ljava/lang/ClassLoader;)Lvp7;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
