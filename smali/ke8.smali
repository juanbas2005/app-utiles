.class public final synthetic Lke8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lre8;


# direct methods
.method public synthetic constructor <init>(Lre8;I)V
    .locals 0

    .line 1
    iput p2, p0, Lke8;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lke8;->b:Lre8;

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
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lke8;->a:I

    .line 2
    .line 3
    sget-object v1, Lkd8;->w:Lkd8;

    .line 4
    .line 5
    iget-object p0, p0, Lke8;->b:Lre8;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lre8;->i:Lfe8;

    .line 11
    .line 12
    iget-object p0, p0, Lre8;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lfe8;->d(Ljava/lang/String;)Lkd8;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-ne v2, v1, :cond_0

    .line 20
    .line 21
    sget-object v1, Lkd8;->x:Lkd8;

    .line 22
    .line 23
    invoke-virtual {v0, v1, p0}, Lfe8;->j(Lkd8;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, Lfe8;->a:La96;

    .line 27
    .line 28
    new-instance v2, Lsd8;

    .line 29
    .line 30
    const/16 v4, 0x9

    .line 31
    .line 32
    invoke-direct {v2, p0, v4}, Lsd8;-><init>(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    invoke-static {v1, v3, v4, v2}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    const/16 v1, -0x100

    .line 46
    .line 47
    invoke-virtual {v0, v1, p0}, Lfe8;->k(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    move v3, v4

    .line 51
    :cond_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_0
    iget-object v0, p0, Lre8;->a:Lbe8;

    .line 57
    .line 58
    iget-object v2, v0, Lbe8;->b:Lkd8;

    .line 59
    .line 60
    iget-object v3, v0, Lbe8;->c:Ljava/lang/String;

    .line 61
    .line 62
    if-eq v2, v1, :cond_1

    .line 63
    .line 64
    sget-object p0, Lse8;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v2, " is not in ENQUEUED state. Nothing more to do"

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, p0, v1}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    invoke-virtual {v0}, Lbe8;->c()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_2

    .line 98
    .line 99
    iget-object v2, v0, Lbe8;->b:Lkd8;

    .line 100
    .line 101
    if-ne v2, v1, :cond_3

    .line 102
    .line 103
    iget v1, v0, Lbe8;->k:I

    .line 104
    .line 105
    if-lez v1, :cond_3

    .line 106
    .line 107
    :cond_2
    iget-object p0, p0, Lre8;->f:Lz53;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 113
    .line 114
    .line 115
    move-result-wide v1

    .line 116
    invoke-virtual {v0}, Lbe8;->a()J

    .line 117
    .line 118
    .line 119
    move-result-wide v4

    .line 120
    cmp-long p0, v1, v4

    .line 121
    .line 122
    if-gez p0, :cond_3

    .line 123
    .line 124
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    sget-object v0, Lse8;->a:Ljava/lang/String;

    .line 129
    .line 130
    new-instance v1, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v2, "Delaying execution for "

    .line 133
    .line 134
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v2, " because it is being executed before schedule."

    .line 141
    .line 142
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {p0, v0, v1}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_3
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 156
    .line 157
    :goto_0
    return-object p0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
