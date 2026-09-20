.class public final synthetic Lcq5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Laq4;

.field public final synthetic y:Laq4;


# direct methods
.method public synthetic constructor <init>(Laq4;Laq4;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcq5;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lcq5;->x:Laq4;

    .line 4
    .line 5
    iput-object p2, p0, Lcq5;->y:Laq4;

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
.method public final b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lcq5;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lcq5;->y:Laq4;

    .line 4
    .line 5
    iget-object p0, p0, Lcq5;->x:Laq4;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    invoke-interface {v1}, La37;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    check-cast p0, Ldy3;

    .line 30
    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    invoke-interface {p0, v2, v3}, Ldy3;->w(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    invoke-interface {v1}, La37;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast p0, Ll35;

    .line 45
    .line 46
    iget-wide v0, p0, Ll35;->a:J

    .line 47
    .line 48
    const/16 p0, 0x20

    .line 49
    .line 50
    shr-long v4, v0, p0

    .line 51
    .line 52
    long-to-int v4, v4

    .line 53
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    shr-long v5, v2, p0

    .line 58
    .line 59
    long-to-int p0, v5

    .line 60
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    cmpg-float p0, v4, p0

    .line 65
    .line 66
    const-wide v4, 0xffffffffL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    if-gtz p0, :cond_1

    .line 72
    .line 73
    and-long/2addr v0, v4

    .line 74
    long-to-int p0, v0

    .line 75
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    and-long v0, v2, v4

    .line 80
    .line 81
    long-to-int v0, v0

    .line 82
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    cmpg-float p0, p0, v0

    .line 87
    .line 88
    if-gez p0, :cond_0

    .line 89
    .line 90
    const/4 p0, 0x1

    .line 91
    goto :goto_0

    .line 92
    :cond_0
    const/4 p0, 0x3

    .line 93
    goto :goto_0

    .line 94
    :cond_1
    and-long/2addr v0, v4

    .line 95
    long-to-int p0, v0

    .line 96
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    and-long v0, v2, v4

    .line 101
    .line 102
    long-to-int v0, v0

    .line 103
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    cmpg-float p0, p0, v0

    .line 108
    .line 109
    if-gez p0, :cond_2

    .line 110
    .line 111
    const/4 p0, 0x2

    .line 112
    goto :goto_0

    .line 113
    :cond_2
    const/4 p0, 0x4

    .line 114
    goto :goto_0

    .line 115
    :cond_3
    const/4 p0, 0x0

    .line 116
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :pswitch_0
    const/4 v0, 0x0

    .line 122
    invoke-interface {p0, v0}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-interface {v1, p0}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    sget-object p0, Lvs7;->a:Lvs7;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
