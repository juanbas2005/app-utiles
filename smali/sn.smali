.class public final synthetic Lsn;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsr2;


# direct methods
.method public synthetic constructor <init>(ILsr2;)V
    .locals 0

    .line 1
    iput p1, p0, Lsn;->w:I

    .line 2
    .line 3
    iput-object p2, p0, Lsn;->x:Lsr2;

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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lsn;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object p0, p0, Lsn;->x:Lsr2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ltp1;

    .line 11
    .line 12
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ll35;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_1
    check-cast p1, Ll35;

    .line 28
    .line 29
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_2
    check-cast p1, Lua6;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_3
    check-cast p1, Lok6;

    .line 44
    .line 45
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    move-object v0, p0

    .line 50
    check-cast v0, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 p0, 0x0

    .line 64
    :goto_0
    check-cast p0, Ljava/lang/Float;

    .line 65
    .line 66
    if-eqz p0, :cond_1

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const/4 p0, 0x0

    .line 74
    :goto_1
    new-instance v0, Lms0;

    .line 75
    .line 76
    const/high16 v2, 0x3f800000    # 1.0f

    .line 77
    .line 78
    invoke-direct {v0, v2}, Lms0;-><init>(F)V

    .line 79
    .line 80
    .line 81
    new-instance v2, Lmq5;

    .line 82
    .line 83
    invoke-direct {v2, p0, v0}, Lmq5;-><init>(FLms0;)V

    .line 84
    .line 85
    .line 86
    sget-object p0, Lmk6;->a:[Lyr3;

    .line 87
    .line 88
    sget-object p0, Ljk6;->c:Lnk6;

    .line 89
    .line 90
    sget-object v0, Lmk6;->a:[Lyr3;

    .line 91
    .line 92
    const/4 v3, 0x1

    .line 93
    aget-object v0, v0, v3

    .line 94
    .line 95
    invoke-interface {p1, p0, v2}, Lok6;->f(Lnk6;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-object v1

    .line 99
    :pswitch_4
    check-cast p1, Ll76;

    .line 100
    .line 101
    iget v0, p1, Ll76;->M:I

    .line 102
    .line 103
    const/4 v2, 0x2

    .line 104
    if-ne v0, v2, :cond_2

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_2
    iget v0, p1, Ll76;->w:I

    .line 108
    .line 109
    const v3, 0x8000

    .line 110
    .line 111
    .line 112
    or-int/2addr v0, v3

    .line 113
    iput v0, p1, Ll76;->w:I

    .line 114
    .line 115
    iput v2, p1, Ll76;->M:I

    .line 116
    .line 117
    :goto_2
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Ljava/lang/Number;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    invoke-virtual {p1, p0}, Ll76;->c(F)V

    .line 128
    .line 129
    .line 130
    return-object v1

    .line 131
    :pswitch_5
    check-cast p1, Lqk5;

    .line 132
    .line 133
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    return-object v1

    .line 137
    :pswitch_6
    check-cast p1, Ll76;

    .line 138
    .line 139
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast p0, Ljava/lang/Number;

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    invoke-virtual {p1, p0}, Ll76;->c(F)V

    .line 150
    .line 151
    .line 152
    return-object v1

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
