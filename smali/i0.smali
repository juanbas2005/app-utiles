.class public final Li0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lj0;


# direct methods
.method public synthetic constructor <init>(Lj0;I)V
    .locals 0

    .line 1
    iput p2, p0, Li0;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Li0;->x:Lj0;

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
    iget v0, p0, Li0;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Li0;->x:Lj0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Lqz3;

    .line 9
    .line 10
    invoke-direct {p0, v1}, Lqz3;-><init>(Lql4;)V

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    new-instance p0, Lfc3;

    .line 15
    .line 16
    invoke-virtual {v1}, Lj0;->n0()Lji4;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p0, v0}, Lfc3;-><init>(Lji4;)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    invoke-virtual {v1}, Lj0;->n0()Lji4;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    new-instance v6, Lb0;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-direct {v6, v0, p0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Liq7;->a:Lv62;

    .line 35
    .line 36
    invoke-static {v1}, Lz62;->f(Lvj1;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    filled-new-array {p0}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    sget-object v0, Lx62;->G:Lx62;

    .line 51
    .line 52
    invoke-static {v0, p0}, Lz62;->c(Lx62;[Ljava/lang/String;)Lv62;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-interface {v1}, Lvq0;->n()Lwo7;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const/4 p0, 0x0

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    invoke-interface {v2}, Lwo7;->getParameters()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Liq7;->d(Ljava/util/List;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    sget-object p0, Lro7;->x:Lkg5;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    sget-object v1, Lro7;->y:Lro7;

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-static/range {v1 .. v6}, Lkl8;->K(Lro7;Lwo7;Ljava/util/List;ZLji4;Lvr2;)Lfu6;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :goto_0
    return-object p0

    .line 87
    :cond_1
    const/16 v0, 0xd

    .line 88
    .line 89
    invoke-static {v0}, Liq7;->a(I)V

    .line 90
    .line 91
    .line 92
    throw p0

    .line 93
    :cond_2
    const/16 v0, 0xc

    .line 94
    .line 95
    invoke-static {v0}, Liq7;->a(I)V

    .line 96
    .line 97
    .line 98
    throw p0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
