.class public final synthetic Ldf7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lze7;


# direct methods
.method public synthetic constructor <init>(Lze7;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldf7;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Ldf7;->x:Lze7;

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
    iget v0, p0, Ldf7;->w:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lvs7;->a:Lvs7;

    .line 5
    .line 6
    iget-object p0, p0, Ldf7;->x:Lze7;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lze7;->g:Lsr2;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    return-object v2

    .line 19
    :pswitch_0
    invoke-virtual {p0}, Lze7;->n()Lhf7;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, Lhf7;->a:Lvl;

    .line 24
    .line 25
    invoke-virtual {p0}, Lze7;->n()Lhf7;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v3, v3, Lhf7;->a:Lvl;

    .line 30
    .line 31
    iget-object v3, v3, Lvl;->x:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-static {v4, v3}, Li95;->a(II)J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-static {v0, v3, v4}, Lze7;->e(Lvl;J)Lhf7;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v3, p0, Lze7;->c:Lvr2;

    .line 47
    .line 48
    invoke-interface {v3, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    iget-wide v3, v0, Lhf7;->b:J

    .line 52
    .line 53
    new-instance v0, Llg7;

    .line 54
    .line 55
    invoke-direct {v0, v3, v4}, Llg7;-><init>(J)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lze7;->w:Llg7;

    .line 59
    .line 60
    iget-object v0, p0, Lze7;->u:Lhf7;

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x5

    .line 64
    invoke-static {v0, v5, v3, v4, v6}, Lhf7;->a(Lhf7;Lvl;JI)Lhf7;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lze7;->u:Lhf7;

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Lze7;->h(Z)V

    .line 71
    .line 72
    .line 73
    return-object v2

    .line 74
    :pswitch_1
    iget-boolean p0, p0, Lze7;->B:Z

    .line 75
    .line 76
    xor-int/2addr p0, v1

    .line 77
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
